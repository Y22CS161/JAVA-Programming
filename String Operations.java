<!DOCTYPE html>
<html>
<head>
    <title>String Operations</title>
    <script>
        function performStringOperations() {
            const stringLiteral = "Hello, World!";
           
            const stringLength = stringLiteral.length;
            const uppercaseString = stringLiteral.toUpperCase();
            const containsSubstring = stringLiteral.includes("World");
            const charIndex = stringLiteral.indexOf("o");
            const replacedString = stringLiteral.replace("World", "Universe");

            document.getElementById("stringLength").innerHTML = "Length of the string: " + stringLength;
            document.getElementById("uppercaseString").innerHTML = "Uppercase string: " + uppercaseString;
            document.getElementById("containsSubstring").innerHTML = "Contains 'World': " + containsSubstring;
            document.getElementById("charIndex").innerHTML = "Index of 'o': " + charIndex;
            document.getElementById("replacedString").innerHTML = "Replaced string: " + replacedString;
        }
    </script>
</head>
<body>
    <h1>String Operations</h1>
    <button onclick="performStringOperations()">Perform String Operations</button>
    <div id="stringLength"></div>
    <div id="uppercaseString"></div>
    <div id="containsSubstring"></div>
    <div id="charIndex"></div>
    <div id="replacedString"></div>
</body>
</html>

