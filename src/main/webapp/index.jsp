<%--
  Created by IntelliJ IDEA.
  User: pawelsadownik
  Date: 28.05.2018
  Time: 12:51
  To change this template use File | Settings | File Templates.

  <label>Wpisz nazwe miasta<input type = "name" id="name" name="name"/></label>
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<H1>PROGNOZA POGODY1.2</H1>

<form id="form" class="float" action="WeatherServlet" method="post">
    <select name="name">
        <option>Gdansk</option>
        <option>Krakow</option>
        <option>Warszawa</option>
        <option>Lublin</option>
        <option>Poznan</option>
        <option>Wroclaw</option>
        <option>Lodz</option>
        <option>Katowice</option>
    </select>
    <br>
    <button type="submit">zatwierdź</button>
</form>
</body>
</html>
