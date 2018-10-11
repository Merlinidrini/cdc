<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@include file="Header.jsp"%>
	<h1><c:out value="${album.getName()}" /></h1>

	<table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Artist</th>
                <th>Genre</th>
                <th>Year</th>
                <th></th>

            </tr>
            <c:forEach items="${album.getTracks()}" var="track">
                <tr>
                    <td>${track.getId()}</td>
                    <td><c:out value="${track.getName()}" /></td>
                    <td><c:out value="${track.getArtist()}" /></td>
                    <td><c:out value="${track.getGenre()}" /></td>
                    <td><c:out value="${track.getYear()}" /></td>
                    <td>
                    	<audio controls>
							  <source src="<c:out value="${album_parent}" /><c:out value="${track.getPath()}" />" type="audio/mpeg">
						Your browser does not support the audio element.
						</audio>
					</td>
                </tr>
            </c:forEach>
       </table>

<%@include file="Footer.jsp"%>