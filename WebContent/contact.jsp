<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Page</title>
<link rel="icon" href="images\logo3.png" />
<!-- <link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
<script src='https://kit.fontawesome.com/a076d05399.js'></script> -->
<link rel="stylesheet" type="text/css" href="styles\style.css" />
</head>
<body id="admin">
    <header> <nav> <a id="home-icon" href="index.jsp"> HOME</a> </nav></header>
    <div id="logo" style="display: inline-block; align: center;">
        <img src="images\logo3.png" border="0" />
    </div>
    <div id="logo-name" style="display: inline-block; min-width: 3.8cm;">
        <b>ATTENDANCE MARKING</b> <br> <b>FOR CLASSROOM</b>
    </div>
    <div class="contact-admin">
        <form action="user.jsp" method="post">
            <table cellspacing="15">
                <h3 id="heading">CONTACT US</h3>
                <tr>
                    <td><b> ADDRESS </b></td>
                    <td>Cognizant Academy,</td>
                </tr>
                <tr>
                    <td>
                    <td>SIPCOT IT Park,Siruseri,</td>
                    </td>
                </tr>
                <tr>
                    <td>
                    <td>TamilNadu-603103.</td>
                    </td>
                </tr>
                
                <tr></tr>
                <tr>
                    <td id="phone"><label><b>PHONE</b></label></td>
                    <td>(703)432-1700</td>
                </tr>
                <tr>
                    <td id="phone"><label><b>EMAIL</b></label></td>
                    <td>info@cognizant.com</td>
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