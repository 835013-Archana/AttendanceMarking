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
    <header> <nav> <a id="home-icon" href="index.jsp"> HOME</a></nav> <nav> <a
        href="trainer.jsp"> BACK</a> </nav></header>
    <div id="logo" style="display: inline-block; align: center;">
        <img src="images\logo3.png" border="0" />
    </div>
    <div id="logo-name">
        <b>ATTENDANCE MARKING</b> <br> <b>FOR CLASSROOM</b>
    </div>
     <div class="container">
        <form action="" method="post">
            <table cellspacing="35">
                <tr>
                    <td><label for="trainer-id"><b>Trainer ID </b></label></td>
                    <td><input type="text" id="trainer-id" name="trainerId"
                        value="${trainer.trainerId}" /></td>
                </tr>
                <tr>
                    <td><label for="trainer-name"><b>Trainer Name</b></label></td>
                    <td><input type="text" id="trainer-name" name="trainerName"
                        value="${trainer.trainerName}" /></td>
                </tr>
                <tr>
                    <td><label for="contact-number"><b>Contact Number</b></label></td>
                    <td><input type="text" id="contact-number" name="contactNumber"
                        value="${trainer.contactNumber}" /></td>
                </tr>
                <tr>
                    <td><label for="email"><b>Email</b></label></td>
                    <td><input type="text" id="email" name="email" value="${trainer.email}" /></td>
                </tr>
                <tr>
                    <td><label for="skill-set"><b>Skill Set</b></label></td>
                    <td><select name="skillSet" id="skillSet">
                            <option value="${trainer.skillSet}">${trainer.skillSet}</option>
                            <option value="JAVA001" id="skillSet">JAVA</option>
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
    <footer>Attend today and achieve tomorrow!! <a href="about.jsp" id="footer-button1">About Us</a> <a
        href="contact.jsp" id="footer-button2">Contact</a> </footer>
</body>
</html>
