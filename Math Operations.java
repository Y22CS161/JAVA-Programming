<!DOCTYPE html>
<html>
<head>
    <title>Math Operations</title>
    <script>
        function performMathOperations() {
            const number = 5;
           
            const roundedNumber = Math.round(number);
            const poweredNumber = Math.pow(number, 2);
            const squareRoot = Math.sqrt(number);
            const absoluteValue = Math.abs(-10);
            const ceiledNumber = Math.ceil(3.14);
            const flooredNumber = Math.floor(4.9);
            const sineValue = Math.sin(Math.PI / 2);
            const cosineValue = Math.cos(0);
            const minValue = Math.min(2, 4, 6, 8);
            const maxValue = Math.max(2, 4, 6, 8);
            const randomValue = Math.random();
            const arccosineValue = Math.acos(0.5);
            const arcsineValue = Math.asin(0.5);

            document.getElementById("roundedNumber").innerHTML = "Rounded number: " + roundedNumber;
            document.getElementById("poweredNumber").innerHTML = "Powered number: " + poweredNumber;
            document.getElementById("squareRoot").innerHTML = "Square root: " + squareRoot;
            document.getElementById("absoluteValue").innerHTML = "Absolute value: " + absoluteValue;
            document.getElementById("ceiledNumber").innerHTML = "Ceiled number: " + ceiledNumber;
            document.getElementById("flooredNumber").innerHTML = "Floored number: " + flooredNumber;
            document.getElementById("sineValue").innerHTML = "Sine value: " + sineValue;
            document.getElementById("cosineValue").innerHTML = "Cosine value: " + cosineValue;
            document.getElementById("minValue").innerHTML = "Minimum value: " + minValue;
            document.getElementById("maxValue").innerHTML = "Maximum value: " + maxValue;
            document.getElementById("randomValue").innerHTML = "Random value: " + randomValue;
            document.getElementById("arccosineValue").innerHTML = "Arccosine value: " + arccosineValue;
            document.getElementById("arcsineValue").innerHTML = "Arcsine value: " + arcsineValue;
        }
    </script>
</head>
<body>
    <h1>Math Operations</h1>
    <button onclick="performMathOperations()">Perform Math Operations</button>
    <div id="roundedNumber"></div>
    <div id="poweredNumber"></div>
    <div id="squareRoot"></div>
    <div id="absoluteValue"></div>
    <div id="ceiledNumber"></div>
    <div id="flooredNumber"></div>
    <div id="sineValue"></div>
    <div id="cosineValue"></div>
    <div id="minValue"></div>
    <div id="maxValue"></div>
    <div id="randomValue"></div>
    <div id="arccosineValue"></div>
    <div id="arcsineValue"></div>
</body>
</html>

