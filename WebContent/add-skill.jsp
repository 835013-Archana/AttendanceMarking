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
    <div class="skill-container">
        <form name="attendance" action="AddSkillDetails" autocomplete="off"
            onsubmit="return validateAddSkillForm()" method="post">
            <table cellspacing="35">
                <h3 align="center">Add Skill</h3>
                <tr>
                    <td><label for="skillId"><b>Skill ID </b></label></td>
                    <td><select name="skillId" id="skillId">
                            <option value="">Select Skill</option>
                            <option value="JAVA001" id="skillId">JAVA001</option>
                            <option value="ADVJAVA002" id="skillId">ADVJAVA002</option>
                            <option value="PYTHON003" id="skillId">PYTHON003</option>
                            <option value="SWIFT004" id="skillId">SWIFT004</option>
                            <option value="INTERPERSONAL005" id="skillId">INTERPERSONAL005</option>
                            <option value="COMMUNICATION006" id="skillId">COMMUNICATION006</option>
                    </select></td>
                </tr>
                <tr>
                    <td><label for="skillType"><b>Skill Type</b></label></td>
                    <td><input type="text" id="skillType" name="skillType" /></td>
                </tr>
                <tr>
                    <td><label for="skillDescription"><b>Skill Description</b></label></td>
                    <td><input type="text" id="skillDescription" name="skillDescription" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" id="button" value="Add Skill" /></td>
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
