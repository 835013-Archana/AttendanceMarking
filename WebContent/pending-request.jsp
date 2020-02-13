<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
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
    <c:set var="pendingList" value="${pendingList}"></c:set>
   <header> <nav> <a id="home-icon" href="index.jsp"> HOME</a></nav> </header> 
    <div id="logo">
        <img src="images\logo3.png" border="0" />
    </div>
    <div id="logo-name">
        <b>ATTENDANCE MARKING</b> <br> <b>FOR CLASSROOM</b>
    </div>
    <table id="pending-table" border="2">
          <tr>
            <th align="left">FirstName</th>
            <th align="center">LastName</th>
            <th align="right">Age</th>
            <th align="center">Gender</th>
            <th align="center">ContactNumber</th>
            <th align="center">AdminId</th>
            <th align="center">Status</th>
        </tr>
        <c:forEach items="${pending}" var="pending">
            <tr>
                <td>${pending.getFirstName()}</td>
                <td>${pending.getLastName()}</td>
                <td>${pending.getAge()}</td>
                <td>${pending.getGender()}</td>
                <td>${pending.getContactNumber()}</td>
                <td>${pending.getAdminId()}</td>
                <td>${pending.getStatus()}</td>
                
                <td align="center"><a href="ShowAdminApproveRequest?adminId=${pending.getAdminId()}">Edit</td>
            </tr>
        </c:forEach>
    </table>
</body>
<footer>Attend today and achieve tomorrow!! <a href="about.jsp" id="footer-button1">About
    Us</a> <a href="contact.jsp" id="footer-button2">Contact</a> </footer>
</html>