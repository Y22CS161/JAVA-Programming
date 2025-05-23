<!DOCTYPE html>
<html><title>form events</title>
<body>
<h1>HTML DOM Events</h1>
<h2>The focus and blur Events</h2>
<p>When you enter the input field, a function sets the background color to pink.</p>
<p>When you leave the input field, a function removes the background color.</p>

<form id="myForm">
  <input type="text" id="myInput">
</form>

<script>
let x = document.getElementById("myForm");
x.addEventListener("focus", myFocusFunction, true);
x.addEventListener("blur", myBlurFunction, true);

function myFocusFunction() {
  document.getElementById("myInput").style.backgroundColor = "pink";  
}

function myBlurFunction() {
  document.getElementById("myInput").style.backgroundColor = "";  
}
</script>

</body>
</html>

