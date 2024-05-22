<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
<table class="table table-dark">
    <tr>
        <th>id</th>
        <th>Name</th>
        <th>Description</th>
        <th>Date de debut</th>
        <th>Date de fin</th>
        <th>Budget</th>
    </tr>

    <c:forEach var="project" items="${model}">

        <tr>
            <td>${model.}</td>
            <td>${project.}</td>
            <td>${project.idProject}</td>
            <td>${project.idProject}</td>
            <td>${project.idProject}</td>
            <td>${project.idProject}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>