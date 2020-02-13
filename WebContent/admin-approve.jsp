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
    <c:set var="admin" value="${admin}"></c:set> 
   <header> <nav> <a id="home-icon" href="index.jsp"> HOME</a></nav> </header> 
    <div id="logo">
        <img src="images\logo3.png" border="0" />
    </div>
    <div id="logo-name">
        <b>ATTENDANCE MARKING</b> <br> <b>FOR CLASSROOM</b>
    </div>
 <div class="container">
        <form name="attendance" action="AdminApproveRequest" autocomplete="off"
            method="post">
            <div class="input-icons">
                <h3 align="center">Admin Approval</h3>
                <i class="fas fa-user-alt icon" aria-hidden="true"></i> <input class="input-field"
                    type="text" name="firstName" id="firstName" placeholder="FirstName" size="2" value="${admin.getFirstName()}" readonly/>
            </div>
            <div class="input-icons">
                <i class="fas fa-user-alt icon" aria-hidden="true"></i> <input class="input-field"
                    type="text" name="lastName" id="lastName" placeholder="LastName" size="2" value="${admin.getLastName()}" readonly />
            </div>
            <div class="input-icons">
                <i class="fas fa-calendar-check icon" aria-hidden="true"></i> <input
                    class="input-field" type="text" name="age" id="age" value="${admin.getAge()}" readonly/> &nbsp;
            </div>
            
            <div class="input-icons">
                <i class="fas fa-phone-alt icon" aria-hidden="true"></i> <input class="input-field"
                    type="text" name="contactNumber" id="contactNumber" placeholder="Contact Number"
                    size="2" value="${admin.getContactNumber()}" readonly/>
            </div>
            <div class="input-icons">
                <i class="fas fa-user-shield icon" aria-hidden="true"></i> <input
                    class="input-field" type="text" name="adminId" id="adminId"
                    placeholder="Admin Id" size="2" value="${admin.getAdminId()}" readonly/>
            </div>
            
            <div class="input-icons">
                <input class="input-field"
                    type="text" name="status" id="status" value="Pending" size="2" />
            </div>
            <table>
                <tr>
                    <td><input type="submit" id="register1" value="Save" /></td>
                </tr>
            </table>
        </form>
    </div>  


</body>
<footer>Attend today and achieve tomorrow!! <a href="about.jsp" id="footer-button1">About
    Us</a> <a href="contact.jsp" id="footer-button2">Contact</a> </footer>
</html>