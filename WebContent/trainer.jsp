<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
<link rel="icon" href="images\logo3.png" />
<link rel="stylesheet" type="text/css" href="styles\style.css" />
<script type="text/javascript">
	window.history.forward();
</script>
</head>
<body id="admin">
    <div id="logo">
        <img src="images\logo3.png" border="0" />
    </div>
    <div id="logo-name" style="display: inline-block; min-width: 3.8cm;">
        <b>ATTENDANCE MARKING</b> <br> <b>FOR CLASSROOM</b>
    </div>
    <header> <nav> <a id="home-icon" href="index.jsp"> HOME</a> </nav> <a
        id="trainer-logout" href="index.jsp"> LOGOUT</a>
    <div class="dropdown">
        <button class="dropbtn">Trainer</button>
        <div class="dropdown-content">
            <a href="add-trainer.jsp">Add Trainer</a> <a href="update-trainer.jsp">Update
                Trainer</a>
        </div>
    </div>
    <div class="dropdown1">
        <button class="dropbtn1">Session</button>
        <div class="dropdown1-content">
            <a href="add-session.jsp">Add Session</a> <a href="ShowSessionDetails">Update
                Session</a>
        </div>
    </div>
    <div class="dropdown2">
        <button class="dropbtn2">Skills</button>
        <div class="dropdown2-content">
            <a href="add-skill.jsp">Add Skils</a> <a href="map-skill.jsp">Map Skills</a>
        </div>
    </div>
    <div class="dropdown3">
        <button class="dropbtn3">Enrollment</button>
        <div class="dropdown3-content">
            <a href="super-user.jsp">Enrollment</a>
        </div>
    </div>
    </header>
    <h1 id="trainer-quotes">
        THE INFLUENCE OF TEACHERS <br />EXTENDS BEYOND THE CLASSROOM,<br />WELL INTO THE FUTURE. <br />&nbsp;&nbsp;&nbsp;-
        F.SIONIL JOSE
    </h1>
    <footer>Attend today and achieve tomorrow!! <a href="about.jsp" id="footer-button1">About Us</a> <a
        href="contact.jsp" id="footer-button2">Contact</a> </footer>
</body>
</html>
