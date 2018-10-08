<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Albums</title>
</head>
<body>
	<table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Artist</th>
                <th>Genre</th>
                <th>Year</th>
            </tr>
            <c:forEach items="${albums}" var="album">
                <tr>
                    <td>${album.id}</td>
                    <td><c:out value="${album.name}" /></td>
                    <td><c:out value="${album.artist}" /></td>
                    <td><c:out value="${album.genre}" /></td>
                    <td><c:out value="${album.year}" /></td>
                </tr>
            </c:forEach>
       </table>
</body>
</html>