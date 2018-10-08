<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import="org.apache.taglibs.standard.tag.rt.core.ForEachTag" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cd Collection</title>
</head>
<body>
Hello  
       
 <br>  
       
 <% List<Album> albums = GetData.getAlbums(); %>
 <c:forEach items="${albums}" var="item">
    <tr>
      <td><c:out value="${item}" /></td>
    </tr>
  </c:forEach>
</body>
</html>