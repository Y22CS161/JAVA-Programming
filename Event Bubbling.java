<html>
  <head>  
<meta charset="utf-8">
   <title>Event Bubbling</title>  
<script>
function documentClick(){
 alert( "You clicked in the document." );
 } // end function documentClick

 function bubble( e )
 {
 alert( "This will bubble." );

 } // end function bubble

 function noBubble( e )
 {
 alert( "This will not bubble." );

 } // end function noBubble

 function registerEvents()
 {
 document.addEventListener( "click", documentClick, false );
 document.getElementById( "bubble" ).addEventListener(
 "click", bubble, false );
 document.getElementById( "noBubble" ).addEventListener(
 "click", noBubble, false );
 } // end function registerEvents
 window.addEventListener( "load", registerEvents, false );
 </head>  
</script>
<body>      
<p id = "bubble">Bubbling enabled.</p>  
<p id = "noBubble">Bubbling disabled.</p>
 </body>
 </html>

