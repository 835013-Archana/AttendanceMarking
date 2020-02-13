<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/script.js">
	window.history.forward();
</script>
<link rel="stylesheet" type="text/css" href="styles\style.css" />
<link rel="icon" href="images\logo3.png" />
<link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
</head>
<body id="admin">
    <c:set var="session" value="${session}"></c:set> 
   <header> <nav> <a id="home-icon" href="index.jsp"> HOME</a></nav> </header> 
    <div id="logo">
        <img src="images\logo3.png" border="0" />
    </div>
    <div id="logo-name">
        <b>ATTENDANCE MARKING</b> <br> <b>FOR CLASSROOM</b>
    </div>
 <div class="container">
        <form name="attendance" action="UpdateSessionDetails" autocomplete="off"
            onsubmit="return validateAddSessionForm()" method="post">
            <table cellspacing="35">
                <h3 align="center">Add Session</h3>
                <tr>
                    <td><label for="session-id"><b>Session ID</b></label></td>
                    <td><select name="sessionId" id="session-id" readonly>
                            <option value="${session.getSessionId()}">${session.getSessionId()}</option>
                            <option value="BehaviouralSession" id="session-id" >BehaviouralSession</option>
                            <option value="ITSession" id="session-id" >ITSession</option>
                            <option value="EtiquiteMail" id="session-id">EtiquiteMail</option>
                    </select></td>
                </tr>
                <tr>
                    <td><label for="session-description"><b>Session Description </b></label></td>
                    <td><input type="text" id="session-description" name="sessionDescription" value="${session.getSessionDescription()}" /></td>
                </tr>
               <tr>
                    <td><label for="skill-id"><b>Skill ID </b></label></td>
                    <td><select name="skillId" id="skill-id" readonly>
                            <option value="${session.getSkillId()}">${session.getSkillId()}</option>
                            <option value="JAVA001" id="skill-id">JAVA001</option>
                            <option value="ADVJAVA002" id="skill-id">ADVJAVA002</option>
                            <option value="PYTHON003" id="skill-id">PYTHON003</option>
                            <option value="SWIFT004" id="skill-id">SWIFT004</option>
                            <option value="INTERPERSONAL005" id="skill-id">INTERPERSONAL005</option>
                            <option value="COMMUNICATION006" id="skill-id">COMMUNICATION006</option>
                    </select></td>
                </tr>
                <tr>
                    <td><label for="session-date"><b>Session Date</b></label></td>
                    <td><input type="date" id="session-date" name="date" value="${session.getDate()}" /></td>
                </tr>
                <tr>
                    <td><label for="session-time"><b>Session Time</b></label></td>
                    <td><input type="time" id="session-time" name="time" value="${session.getTime()}" /></td>
                </tr>
                <tr>
                    <td><label for="available-slots"><b>Available Slots</b></label></td>
                    <td><input type="text" id="available-slots" name="availableSlots" value="${session.getAvailableSlots()}" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" id="button" value="save" /></td>
                </tr>
            </table>
        </form>
    </div>

</body>
<footer>Attend today and achieve tomorrow!! <a href="about.jsp" id="footer-button1">About
    Us</a> <a href="contact.jsp" id="footer-button2">Contact</a> </footer>
</html>