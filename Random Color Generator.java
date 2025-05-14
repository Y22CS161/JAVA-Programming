<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1.0">
    </head>
    <body>
        <script>
            const all = document.querySelector('*');
            setInterval(function() {
                all.style.color = getRandomColor();
                all.style.backgroundColor = getRandomColor();
            }, 1000);
           
            function getRandomColor() {
                var col = "123456789ABCDEF";
                var c = '#';
                for (var i = 0; i < 6; i++) {
                    var x = Math.floor(Math.random() * 16);
                    c = c + col[x];
                }
                return c;
            }
        </script>
        <p>Hii !!! Look how colourful I am...</p>
    </body>
</html>
