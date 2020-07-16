// Enable functions just after the page has loaded:
$(document).ready(function () {
  // $("p.para1").css("color", "red");
  // ----------------------------------------------
  $("p.para1").css({
    color: "red",
    background: "#ccc",
  });
  // ----------------------------------------------
  // $("p.para2").addClass("myClass");
  // $("p.para2").removeClass("myClass");
  // ----------------------------------------------
  $("#btn1").click(function () {
    $("p.para2").toggleClass("myClass");
  });
  // ----------------------------------------------
  // $("#my-div").text("Hello, World!");
  // ----------------------------------------------
  // $("#my-div").html("<h3>Hello</h3>");
  // alert($("#my-div").text());
  // ----------------------------------------------
  // $("ul").append("<li>Last Item</li>");
  // $("ul").prepend("<li>First Item</li>");
  // ----------------------------------------------
  // $(".para1").appendTo(".para2");
  // $(".para1").prependTo(".para2");
  // ----------------------------------------------
  // $("ul").before("<h4>Before the list</h4>");
  // $("ul").after("<h4>After the list</h4>");
  // ----------------------------------------------
  // $("ul").empty(); // "Hide" the element (visually)
  // ----------------------------------------------
  // $("ul").detach(); // Remove the element from the DOM
  // ----------------------------------------------
  // $("a").attr("target", "_blank");
  // ----------------------------------------------
  // $("#btn1").click(function () {
  //   alert($("a").attr("href"));
  // });
  // ----------------------------------------------
  // $("a").removeAttr("target");
  // ----------------------------------------------
  // $("p").wrap("<h1>");
  // ----------------------------------------------
  // $("p").wrapAll("<h1>");
  // ----------------------------------------------
  // $("#new-item").keyup(function (e) {
  //   var code = e.which;
  //   if (code == 13) {
  //     e.preventDefault();
  //     $("ul").append("<li>" + e.target.value + "</li>");
  //   }
  // });
  // var myArray = ["Daniel", "Caroline", "Francisca"];
  // $.each(myArray, function (i, value) {
  //   $("#users").append("<li>" + value + "</li>");
  // });
  // ----------------------------------------------
  $("#new-item").keyup(function (e) {
    var code = e.which;
    if (code == 13) {
      e.preventDefault();
      $("ul").append("<li>" + e.target.value + "</li>");
    }
  });
  var newArray = $("ul#list li").toArray();
  $.each(newArray, function (i, value) {
    console.log(value.innerHTML);
  });
  // ----------------------------------------------
});
