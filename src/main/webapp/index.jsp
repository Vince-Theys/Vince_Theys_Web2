<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>home</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="web2.css">


    <script>function myFunction() {
        var x = document.getElementById("myTopnav");
        if (x.className === "topnav") {
            x.className += " responsive";
        } else {
            x.className = "topnav";
        }
    }
    </script>
</head>
<body>

<header>
    <h1 class="tittel">Home</h1>
    <nav>
        <div class="topnav" id="myTopnav">
            <a href="index.jsp" class="active">Home</a>
            <a href="voegtoe.jsp">Voeg Toe</a>
            <a href="overzicht.jsp">Overzicht</a>
            <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                <i class="fa fa-bars"></i></a>
        </div>
    </nav>
</header>





<main>
    <p>
        Hier kan je een overzicht maken van alle F1-Teams
    </p>

</main>



<footer>

</footer>

</body>
</html>