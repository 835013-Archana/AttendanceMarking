<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
<script type="text/javascript" src="js/script.js">
	window.history.forward();
</script>
<link rel="icon" href="images\logo3.png" />
<link rel="stylesheet" type="text/css" href="styles\style.css" />
<link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
<script src='https://kit.fontawesome.com/a076d05399.js'>
	
</script>
</head>
<body id="admin">
    <c:set var="trainer" value="${trainer}"></c:set>
    <header> <nav> <a id="home-icon" href="index.jsp"> HOME</a></nav> <a
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
            <a href="add-session.jsp">Add Session</a> <a href="update-session.jsp">Update
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
    <div id="logo">
        <img src="images\logo3.png" border="0" />
    </div>
    <div id="logo-name">
        <b>ATTENDANCE MARKING</b> <br> <b>FOR CLASSROOM</b>
    </div>
    <div class="update-container">
        <form name="attendance" action="ShowTrainerDetails?TrainerId=${trainer.trainerId}"
            method="post" autocomplete="off" onsubmit="return validateUpdateTrainerForm()">
            <h3 align="center">Search Trainer</h3>
            <div class="input-icons">
                <i class="fa fa-search icon" aria-hidden="true"></i> <input class="input-field"
                    type="text" name="trainerId" id="trainerId" placeholder="Trainer Id" />
            </div>
            <table cellspacing="35">
                <tr>
                    <td></td>
                    <td><input type="submit" id="button" value="Show" /></td>
                </tr>
            </table>
        </form>
    </div>
    <footer>Attend today and achieve tomorrow!! <a href="about.jsp" id="footer-button1">About Us</a> <a
        href="contact.jsp" id="footer-button2">Contact</a> </footer>
</body>
</html>
