document.getElementById("issueInputForm").addEventListener("submit", saveIssue);

function saveIssue(event) {
  var issueDescription = document.getElementById("issueDescriptionInput").value;
  var issueSeverity = document.getElementById("issueSeverityInput").value;
  var issueAssignedTo = document.getElementById("issueAssignedToInput").value;
  var issueId = chance.guid();
  var issueStatus = "Open";

  var issue = {
    id: issueId,
    description: issueDescription,
    severity: issueSeverity,
    assignedTo: issueAssignedTo,
    status: issueStatus,
  };

  if (localStorage.getItem("issues") == null) {
    var issues = [];
    issues.push(issue);
    localStorage.setItem("issues", JSON.stringify(issues));
  } else {
    var issues = JSON.parse(localStorage.getItem("issues"));
    issues.push(issue);
    localStorage.setItem("issues", JSON.stringify(issues));
  }

  document.getElementById("issueInputForm").reset();

  fetchIssues();

  event.preventDefault();
}

function setStatusClosed(id) {
  var issues = JSON.parse(localStorage.getItem("issues"));

  for (let i = 0; i < issues.length; i++) {
    if (issues[i].id == id) {
      issues[i].status = "Closed";
    }
  }

  localStorage.setItem("issues", JSON.stringify(issues));

  fetchIssues();
}

function deleteIssue(id) {
  var issues = JSON.parse(localStorage.getItem("issues"));

  for (let i = 0; i < issues.length; i++) {
    if (issues[i].id == id) {
      issues.splice(i, 1);
    }
  }

  localStorage.setItem("issues", JSON.stringify(issues));

  fetchIssues();
}

function fetchIssues() {
  var issues = JSON.parse(localStorage.getItem("issues"));
  var issuesList = document.getElementById("issues-list");

  if (issues == null) return;

  issuesList.innerHTML = "";

  for (let i = 0; i < issues.length; i++) {
    var id = issues[i].id;
    var description = issues[i].description;
    var severity = issues[i].severity;
    var assignedTo = issues[i].assignedTo;
    var status = issues[i].status;

    var labelHTML;
    var buttonHTML;

    if (status === "Open") {
      labelHTML = '<p><span class="label label-info">' + status + "</span></p>";
      buttonHTML =
        '<a href="#" onclick="setStatusClosed(\'' +
        id +
        '\')" class="btn btn-warning">Close</a> ';
    } else if (status === "Closed") {
      labelHTML =
        '<p><span class="label label-warning">' + status + "</span></p>";
      buttonHTML = "";
    }

    issuesList.innerHTML +=
      '<div class="well">' +
      "<h6>Issue ID: " +
      id +
      "</h6>" +
      labelHTML +
      "<h3>" +
      description +
      "</h3>" +
      '<p><span class="glyphicon glyphicon-time"></span> ' +
      severity +
      "</p>" +
      '<p><span class="glyphicon glyphicon-user"></span> ' +
      assignedTo +
      "</p>" +
      buttonHTML +
      '<a href="#" onclick="deleteIssue(\'' +
      id +
      '\')" class="btn btn-danger">Delete</a></div>';
  }
}
