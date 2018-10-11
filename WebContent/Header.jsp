
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Cd Collection - ${page}</title>
<style>
body {margin: 0;
		font-family: "Lucida Sans Unicode", "Lucida Grande", sans-serif;
	}
	
table, tr, td{
	border-collapse: collapse;
	border: 1px solid blue;
	white-space: nowrap;
}
	
div.topbar {
	background-color: #555555;
	color: white;
	padding: 8px 16px;
	font-size: 40px;
	text-shadow: 2px 2px 4px #000000;
	position: -webkit-sticky;
	position: sticky;
	top: 0;
	height: 25%;
	width: 100%;
}

ul.sidenav {
    list-style-type: none;
	font-size: 20px;
    margin: 0;
    padding:0;
    width: 18%;
    background-color: #2B6CC4;
    position: fixed;
    height: 100%;
    overflow: auto;
}


ul.sidenav li a {
    display: block;
    color: #FFFFFF;
    padding: 8px 16px;
    text-decoration: none;
}
 
ul.sidenav li a.active {
    background-color: #005599;
    color: white;
}

ul.sidenav li a:hover:not(.active) {
    background-color: #555;
    color: white;
}

div.content {
	margin-top: 2%;
    margin-left: 25%;
    padding: 1px 16px;
    height: 1000px;
}

@media screen and (max-width: 900px) {
    ul.sidenav {
        width: 100%;
        height: auto;
        position: relative;
    }
    ul.sidenav li a {
        float: left;
        padding: 15px;
    }
    div.content {margin-left: 0;}
}

@media screen and (max-width: 400px) {
    ul.sidenav li a {
        text-align: center;
        float: none;
    }
}
</style>
</head>
<body>
	<div class="topbar">
		<img src="/CdCollectionWeb/Disk.png" alt="Disk" height="4%" width="4%" align="center" hspace="3" vspace="3">
		<b>CD Collection<b></b>
	</div>
	
	<ul class="sidenav">
		<li><a <c:if test="${page == 'Home'}">class="active"</c:if>href="Home">Home</a></li>
		<li><a <c:if test="${page == 'Albums'}">class="active"</c:if>href="Albums">Albums</a>
			<ul>
			<li><a <c:if test="${page == 'New-Album'}">class="active"</c:if>href="New-Album">New album</a></li>
			<li><a <c:if test="${page == 'Edit-Album'}">class="active"</c:if>href="Edit-Album">Edit album</a></li>
			</ul>	
		</li>
		<li><a <c:if test="${page == 'Genres'}">class="active"</c:if>href="Genres">Genres</a>
			<ul>
				<li><a <c:if test="${page == 'New-Genre'}">class="active"</c:if>href="New-Genre">New genre</a></li>
				<li><a <c:if test="${page == 'Edit-Genre'}">class="active"</c:if>href="Edit-Genre">Edit genre</a></li>
			</ul>	
		</li>
		<li><a <c:if test="${page == 'AboutUs'}">class="active"</c:if>href="AboutUs">About Us</a></li>
		<li><a <c:if test="${page == 'Contact'}">class="active"</c:if>href="Contact">Contact</a></li>
	</ul>

<div class="content">