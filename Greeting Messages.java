<!DOCTYPE html>
<html>
<head>
    <title>Greeting Messages</title>
    <script>
        function displayGreetingMessage() {
            var today = new Date();
            var currentHour = today.getHours();
            var greetingMessage;

            if (currentHour < 12) {
                greetingMessage = "Good morning! This is Dimple.";
            } else if (currentHour < 17) {
                greetingMessage = "Good afternoon! This is Dimple.";
            } else {
                greetingMessage = "Good evening! This is Dimple.";
            }

            document.getElementById("greetingMessage").innerHTML = greetingMessage;
        }
    </script>
</head>
<body>
    <h1>Greeting Messages</h1>
    <button onclick="displayGreetingMessage()">Display Greeting Message</button>
    <div id="greetingMessage"></div>
</body>
</html>


