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
        <b>ATTENDANCE MARKING</b> <br /> <b>FOR CLASSROOM</b>
    </div>
    <div class="container">
        <form name="attendance" action="AddSessionDetails" autocomplete="off"
            onsubmit="return validateAddSessionForm()" method="post">
            <table cellspacing="35">
                <h3 align="center">Add Session</h3>
                <tr>
                    <td><label for="session-id"><b>Session ID</b></label></td>
                    <td><select name="sessionId" id="session-id">
                            <option value="">Select Session</option>
                            <option value="BehaviouralSession" id="session-id">BehaviouralSession</option>
                            <option value="ITSession" id="session-id">ITSession</option>
                            <option value="EtiquiteMail" id="session-id">EtiquiteMail</option>
                    </select></td>
                </tr>
                <tr>
                    <td><label for="session-description"><b>Session Description </b></label></td>
                    <td><input type="text" id="session-description" name="sessionDescription" /></td>
                </tr>
                <!-- <tr>
                    <td><label for="skill-id"><b>Skill Id</b></label></td>
                    <td><input type="hidden" id="skill-id" name="skillId" /></td>
                </tr> -->
                <tr>
                    <td><label for="session-date"><b>Session Date</b></label></td>
                    <td><input type="date" id="session-date" name="date" /></td>
                </tr>
                <tr>
                    <td><label for="session-time"><b>Session Time</b></label></td>
                    <td><input type="time" id="session-time" name="time" /></td>
                </tr>
                <tr>
                    <td><label for="available-slots"><b>Available Slots</b></label></td>
                    <td><input type="text" id="available-slots" name="availableSlots" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" id="button" value="Add Session" /></td>
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

