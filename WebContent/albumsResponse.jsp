<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@include file="Header.jsp"%>
	<h1>${page}</h1>
	<form action="AlbumView" method="post">
		<input type="Submit" value="Scan folders" />
	</form>
	<table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Artist</th>
                <th>Genre</th>
                <th>Year</th>
                <th></th>
                <th></th>
            </tr>
            <c:forEach items="${albums}" var="album">
                <tr>
                    <td>${album.getId()}</td>
                    <td><c:out value="${album.getName()}" /></td>
                    <td><c:out value="${album.getArtist()}" /></td>
                    <td><c:out value="${album.getGenre()}" /></td>
                    <td><c:out value="${album.getYear()}" /></td>
                    <td><a href="/CdCollectionWeb/Albums/Edit/id=<c:out value="${album.getId()}" />">Edit</a> </td>
                    <td><a href="/CdCollectionWeb/Albums/View/id=<c:out value="${album.getId()}" />">View</a> </td>
                </tr>
            </c:forEach>
       </table>

<%@include file="Footer.jsp"%>





