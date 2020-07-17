const container = document.querySelector(".container");

let bar = document.createElement("div");

bar.style.height = "10px";
bar.style.width = "0";
bar.style.backgroundColor = "#ff0000";
bar.style.position = "fixed";
bar.style.top = "0";
bar.style.left = "0";
bar.style.zIndex = "9999";
bar.style.transition = "0.2s";

document.body.append(bar);

function updateBar() {
  // Top position on y-axis:
  var scrollY = window.scrollY;

  // window.innerHeight = Height of the visible window display:
  var difference = container.clientHeight - window.innerHeight;

  var scroll = scrollY / difference;
  var position = scroll * 100;

  bar.style.width = position + "%";
}

window.addEventListener("load", () => {
  document.addEventListener("scroll", updateBar);
});
