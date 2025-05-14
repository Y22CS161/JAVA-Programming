<!DOCTYPE html>
<html lang="en">
<head>
    <title>Anchor Collection</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body>
    <a href='https://www.google.com'>Change the link by clicking the Get from google Rvr</a>
    <button type="button" onclick="changeLink()">Get</button>
    <script defer>
        function changeLink() {
            let x = document.getElementsByTagName('a')[0];
            x.innerHTML = "<u>Now click to go Rvr website</u>";
            x.href = "http://www.rvrjcce.ac.in/";
            x.style.textDecoration = "none";
        }
    </script>
</body>
</html>
