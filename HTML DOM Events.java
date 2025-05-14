 <!DOCTYPE html>
<html>
<style>
div {
  width: 150px;
  height: 100px;
  border: 1px solid black;
  margin: 10px;
  padding: 5px;
  text-align: center;
  background-color: lightgray;
}
</style>

<body>
<h1>HTML DOM Events</h1>
<p>This example demonstrates the difference between onmousemove, onmouseenter and onmouseover.</p>
<p>Clock the text below!</p>
<p id="myP" onmousedown="mouseDown()" onmouseup="mouseUp()">
The mouseDown() function sets the color of this text to red.
The mouseUp() function sets the color of this text to blue.
</p>

<div onmousemove="myMoveFunction()">
  <p>onmousemove</p>
  <p id="demo1">Mouse over me!</p>
</div>

<div onmouseenter="myEnterFunction()">
  <p>onmouseenter</p>
  <p id="demo2">Mouse over me!</p>
</div>

<div onmouseover="myOverFunction()">
  <p>onmouseover</p>
  <p id="demo3">Mouse over me!</p>
</div>

<p>The onmousemove event occurs every time the mouse pointer is moved over an element.</p>
<p>The mouseenter event only occurs when the mouse pointer enters an element. </p>
<p>The onmouseover event occurs when the mouse pointer enters an div element.</p>


<script>
let x = 0;
let y = 0;
let z = 0;

function myMoveFunction() {
  document.getElementById("demo1").innerHTML = z+=1;
}

function myEnterFunction() {
  document.getElementById("demo2").innerHTML = x+=1;
}

function myOverFunction() {
  document.getElementById("demo3").innerHTML = y+=1;
}
function mouseDown() {
  document.getElementById("myP").style.color = "red";
}

function mouseUp() {
  document.getElementById("myP").style.color = "blue";
}
</script>
</body>
</html>

