<%--
  Created by IntelliJ IDEA.
  User: vincetheys
  Date: 16/03/2022
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>voeg toe</title>
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
    <h1 class="tittel">Voeg team toe</h1>
    <nav>
        <div class="topnav" id="myTopnav">
            <a href="index.jsp">Home</a>
            <a href="voegtoe.jsp" class="active">Voeg Toe</a>
            <a href="overzicht.jsp">Overzicht</a>
            <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                <i class="fa fa-bars"></i></a>
        </div>
    </nav>
</header>





<main>

    <form>
        <label for="teamnaam">Teamnaam:</label><br>
        <input type="text" id="teamnaam" name="teamnaam" required><br>
        <label for="coureurs">Coureurs:</label><br>
        <input type="text" id="coureurs" name="coureurs" required><br>
        <label for="powerunit">Power Unit:</label><br>
        <input type="text" id="powerunit" name="powerunit" required><br>
        <label for="wchamps">World Championships:</label><br>
        <input type="number" id="wchamps" name="wchamps" required><br>
        <input type="submit" value="Voeg Toe">
    </form>

</main>



<footer>

</footer>

</body>
</html>
