// Enable functions just after the page has loaded:
$(document).ready(function () {
  $("#btnFadeOut").click(function () {
    $("#box").fadeOut(3000, function () {
      $("#btnFadeOut").text("Its Gone");
    });
  });
  // ----------------------------------------------
  $("#btnFadeIn").click(function () {
    $("#box").fadeIn(3000);
  });
  // ----------------------------------------------
  $("#btnFadeToggle").click(function () {
    $("#box").fadeToggle(1000);
  });
  // ----------------------------------------------
  $("#btnSlideDown").click(function () {
    $("#box").slideDown(3000);
  });
  // ----------------------------------------------
  $("#btnSlideUp").click(function () {
    $("#box").slideUp(3000);
  });
  // ----------------------------------------------
  $("#btnSlideToggle").click(function () {
    $("#box").slideToggle(1000);
  });
  //-----------------------------------------------
  $("#btnStop").click(function () {
    $("#box").stop();
  });
  // ----------------------------------------------
  $("#btnMoveRight").click(function () {
    $("#box2").animate({
      left: 200,
      height: "300px",
      width: "300px",
      opacity: "0.5",
    });
  });
  // ----------------------------------------------
  $("#btnMoveLeft").click(function () {
    $("#box2").animate({
      left: 0,
      height: "100px",
      width: "100px",
      opacity: "1",
    });
  });
  // ----------------------------------------------
  $("#btnMoveAround").click(function () {
    var box = $("#box2");
    box.animate({
      left: 150,
    });
    box.animate({
      top: 150,
    });
    box.animate({
      left: 0,
      top: 150,
    });
    box.animate({
      left: 0,
      top: 0,
    });
  });
});
