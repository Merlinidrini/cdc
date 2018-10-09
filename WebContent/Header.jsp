<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Cd Collection</title>
<style>
body {margin: 0;
		font-family: "Lucida Sans Unicode", "Lucida Grande", sans-serif;
	}

ul.sidenav {
    list-style-type: none;
	font-size: 20px;
    margin: 0;
    padding:0;
    width: 20%;
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

<ul class="sidenav">
	<li><a class="active" href="Home">Home</a></li>
	<li><a href="Albums">Albums</a>
		<ul>
		<li><a href="New-Album">New album</a></li>
		<li><a href="edit-album">Edit album</a></li>
		</ul>	
	</li>
	<li><a href="Genres">Genres</a>
		<ul>
			<li><a href="New-Genre">New genre</a></li>
			<li><a href="Edit-Genre">Edit genre</a></li>
		</ul>	
	</li>
	<li><a href="AboutUs">About Us</a></li>
	<li><a href="Contact">Contact</a></li>
</ul>

<div class="content">