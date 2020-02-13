<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
<link rel="icon" href="images\logo3.png" />
<link rel="stylesheet" type="text/css" href="styles\style.css" />
<script type="text/javascript" src="js/script.js">
	window.history.forward();
</script>
</head>
<body id="admin">
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

    <div class="container">
        <form name="attendance" action="AddTrainerDetails" autocomplete="off"
            onsubmit="return validateAddTrainerForm()" method="post">
            <table cellspacing="35">
                <h3 align="center">Add Trainer</h3>
                <tr>
                    <td><label for="trainer-id"><b>Trainer ID </b></label></td>
                    <td><input type="text" id="trainerId" name="trainerId" /></td>
                </tr>
                <tr>
                    <td><label for="trainer-name"><b>Trainer Name</b></label></td>
                    <td><input type="text" id="trainerName" name="trainerName" /></td>
                </tr>
                <tr>
                    <td><label for="contact-number"><b>Contact Number</b></label></td>
                    <td><input type="text" id="contactNumber" name="contactNumber" /></td>
                </tr>
                <tr>
                    <td><label for="email"><b>Email</b></label></td>
                    <td><input type="text" id="email" name="email" /></td>
                </tr>
                <tr>
                    <td><label for="skillSet"><b>Skill Set</b></label></td>
                    <td><select name="skillSet" id="skillSet">
                            <option value="">Select Skill Set</option>
                            <option value="JAVA001" id="skillSet">JAVA</option>
                            <option value="ADVJAVA002" id="skillSet">ADVJAVA</option>
                            <option value="PYTHON003" id="skillSet">PYTHON</option>
                            <option value="SWIFT004" id="skillSet">SWIFT</option>
                            <option value="INTERPERSONAL005" id="skillSet">INTERPERSONAL</option>
                            <option value="COMMUNICATION006" id="skillSet">COMMUNICATION</option>
                    </select></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" id="button" value="Add Trainer" /></td>
                </tr>
            </table>
        </form>
    </div>
 <footer>Attend today and achieve tomorrow!! 
 <a href="about.jsp" id="footer-button1">About Us</a>
 <a href="contact.jsp" id="footer-button2">Contact</a>
 </footer>
</body>
</html>
