<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
    <header> <nav> <a id="home-icon" href="index.jsp"> HOME</a> </nav></header>
    <div id="logo">
        <img src="images\logo3.png" border="0" />
    </div>
    <div id="logo-name">
        <b>ATTENDANCE MARKING</b> <br> <b>FOR CLASSROOM</b>
    </div>
    <h4>${status}</h4>
                <h4>${status1}</h4>
    <div class="container-admin">
        <form name="attendance" action="AdminLogin" autocomplete="off"
            onsubmit="return validateAdminLoginForm()" method="post">
            <table cellspacing="15">
                <h3 align="center">Login</h3>
                <tr>

                    <td><label for="adminId"><b>Admin Id</b></label></td>
                    <td><input type="text" id="adminId" name="adminId" /></td>
                </tr>
                <tr>
                    <td><label for="password"><b>Password</b></label></td>
                    <td><input type="password" id="password" name="password" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" id="button" value="Login" /></td>
                </tr>
               <tr>
                    <td><p>
                            New User? <a id="register" href="admin-page.jsp">Register Here</a>
                        </p></td>
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