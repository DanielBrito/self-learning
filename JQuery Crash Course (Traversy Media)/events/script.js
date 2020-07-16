// Enable functions just after the page has loaded:
$(document).ready(function () {
  // $("#btn1").click(function () {
  //   alert("Button clicked!");
  // });
  // ----------------------------------------------
  // The above example is a 'shortcut' of:
  // $("#btn1").on("click", function () {
  //   alert("On button clicked!");
  // });
  // ----------------------------------------------
  // $("#btn1").click(function () {
  //   $(".param1").hide();
  // });
  // $("#btn2").click(function () {
  //   $(".param1").show();
  // });
  // ----------------------------------------------
  // $("#btn1").click(function () {
  //   $(".param1").toggle();
  // });
  // ----------------------------------------------
  // $("#btn1").dblclick(function () {
  //   $(".param1").toggle();
  // });
  // ----------------------------------------------
  // $("#btn1").hover(function () {
  //   $(".param1").toggle();
  // });
  // ----------------------------------------------
  // MouseEnter + MouseLeave = Toggle
  // $("#btn1").on("mouseenter", function () {
  //   $(".param1").toggle();
  // });
  // $("#btn1").on("mouseleave", function () {
  //   $(".param1").toggle();
  // });
  // ----------------------------------------------
  // $("#btn1").on("mousemove", function () {
  //   $(".param1").toggle();
  // });
  // ----------------------------------------------
  // Mouse button events:
  // $("#btn1").on("mousedown", function () {
  //   $(".param1").toggle(); // Hide
  // });
  // $("#btn1").on("mouseup", function () {
  //   $(".param1").toggle(); // Show
  // });
  // ----------------------------------------------
  //$("#btn1").click(function (e) {
  // alert(e.currentTarget.id);
  // alert(e.currentTarget.innerHTML);
  // alert(e.currentTarget.outerHTML);
  // alert(e.currentTarget.className);
  //});
  // ----------------------------------------------
  // $(document).on("mousemove", function (e) {
  //   $("#coords").html("Coords = Y: " + e.clientY + " X: " + e.clientX);
  // });
  // ----------------------------------------------
  // $("input").focus(function () {
  //   $(this).css("background", "pink");
  // });
  // $("input").blur(function () {
  //   $(this).css("background", "white");
  // });
  // ----------------------------------------------
  // $("input").keyup(function (e) {
  //   console.log(e.target.value);
  // });
  // ----------------------------------------------
  // $("select#gender").change(function (e) {
  //   alert("Changed to " + e.target.value);
  // });
  // ----------------------------------------------
  $("#form").submit(function (e) {
    e.preventDefault();
    var name = $("input#name").val();
    console.log("Hello, " + name);
  });
  // ----------------------------------------------
});
