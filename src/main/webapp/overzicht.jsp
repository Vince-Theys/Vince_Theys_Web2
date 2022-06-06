<%@ page import="domain.model.Team" %>
<%@ page import="domain.db.TeamDB" %><%--
  Created by IntelliJ IDEA.
  User: vincetheys
  Date: 16/03/2022
  Time: 17:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>overzicht</title>
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
    <h1 class="tittel">Overzicht teams</h1>
    <nav>
        <div class="topnav" id="myTopnav">
            <a href="index.jsp">Home</a>
            <a href="voegtoe.jsp">Voeg Toe</a>
            <a href="overzicht.jsp" class="active">Overzicht</a>
            <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                <i class="fa fa-bars"></i></a>
        </div>
    </nav>
</header>




<main>

    <p>Teamnaam: <%= request.getParameter("teamnaam")%></p>
    <p>Coureurs: <%= request.getParameter("coureurs")%></p>
    <p>Powerunit: <%= request.getParameter("powerunit")%></p>
    <p>WC: <%= request.getParameter("wchamps")%></p>
    <p>Het team met de meeste kampioenschappen is</p> <%--<%= ((Team)request.getAttribute("meesteKampioenschappen")).getNaam() %></p>--%>

    <a href="voegtoe.jsp">Voeg nieuw team toe</a>



</main>



<footer>

</footer>

</body>
</html>
