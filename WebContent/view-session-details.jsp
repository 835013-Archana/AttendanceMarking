<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pending Requests</title>
<link rel="icon" href="images\logo3.png" />
<link rel="stylesheet" type="text/css" href="styles/style.css" />
<script type="text/javascript" src="js/script.js">
	window.history.forward();
</script>
</head>
<body>
<body id="admin">
    <c:set var="session" value="${session}"></c:set>
   <header> <nav> <a id="home-icon" href="index.jsp"> HOME</a></nav> </header> 
    <div id="logo">
        <img src="images\logo3.png" border="0" />
    </div>
    <div id="logo-name">
        <b>ATTENDANCE MARKING</b> <br> <b>FOR CLASSROOM</b>
    </div>
     <c:if test="${removeSSession==true }">
        <h4 id="remove-session">Session Removed Successfully</h4>
    </c:if>
    <table id="pending-table" border="2">
          <tr>
            <th align="left">SessionId</th>
            <th align="center">SessionDescription</th>
            <th align="right">skillId</th>
            <th align="center">SessionDate</th>
            <th align="center">SessionTime</th>
            <th align="center">AvailableSlots</th>
          
        </tr>
        <c:forEach items="${session}" var="session">
            <tr>
                <td>${session.getSessionId()}</td>
                <td>${session.getSessionDescription()}</td>
                <td>${session.getSkillId()}</td>
                <td>${session.getDate()}</td>
                <td>${session.getTime()}</td>
                <td>${session.getAvailableSlots()}</td>
               
                
                <td align="center"><a href="EditSession?sessionId=${session.getSessionId()}">Edit</a></td>
                <td align="center"><a href="RemoveSession?sessionId=${session.getSessionId()}">delete</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
<footer>Attend today and achieve tomorrow!! <a href="about.jsp" id="footer-button1">About
    Us</a> <a href="contact.jsp" id="footer-button2">Contact</a> </footer>
</html>