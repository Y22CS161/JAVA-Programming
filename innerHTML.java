<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width,initial-scale=1.0">
    </head>
    <body>
        <script>
            let x=document.getElementsByTagName('body')[0];
            let star=document.createElement('span');
            x.append(star);
            child=document.getElementsByTagName('span')[0];
            child.innerHTML="Element and text Added Through child collectio Object";
            child.style.color="blue";
        </script>
    </body>
</html>
