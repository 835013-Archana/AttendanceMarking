<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Page</title>
</head>
<link rel="stylesheet" type="text/css" href="styles\style.css" />
<link rel="icon" href="images\logo3.png" />
<link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
<script src='https://kit.fontawesome.com/a076d05399.js'></script>
<body id="admin">
    <header> <nav> <a id="home-icon" href="index.jsp"> HOME</a></nav></header>
    <div id="logo" style="display: inline-block; align: center;">
        <img src="images\logo3.png" border="0" />
    </div>
    <div id="logo-name" style="display: inline-block; min-width: 3.8cm;">
        <b>ATTENDANCE MARKING</b> </br> <b>FOR CLASSROOM</b>
    </div>
    <div class="container">
        <form action="user-login.jsp" method="post">
            <div class="input-icons">
                <h3 align="center">Registration</h3>
                <i class="fas fa-user-alt icon" aria-hidden="true"></i> <input class="input-field"
                    type="text" name="first-name" placeholder="FirstName" size="2" />
            </div>
            <div class="input-icons">
                <i class="fas fa-user-alt icon" aria-hidden="true"></i> <input class="input-field"
                    type="text" name="last-name" placeholder="LastName" size="2" />
            </div>
            <div class="input-icons">
                <i class="fas fa-user-alt icon" aria-hidden="true"></i> <input class="input-field"
                    type="text" name="empId" placeholder="Employee Id" size="2" />
            </div>
            <div class="input-icons">
                <i class="fas fa-envelope icon" aria-hidden="true"></i> <input class="input-field"
                    type="text" name="emailId" placeholder="Email-Id" size="2" />
            </div>
            <div class="input-icons">
                <i class="fas fa-lock icon" aria-hidden="true"></i> <input class="input-field"
                    type="text" name="Password" placeholder="Password" size="2" />
            </div>
            <table>
                <tr>
                    <td><input type="submit" id="register1" value="Register" /></td>
                </tr>
                <tr></tr>
                <tr></tr>
                <tr></tr>
                <tr></tr>
                <tr></tr>
                <tr>
                    <td><p>
                            Already having an account?<a id="register" href="user-login.jsp">Login</a>
                        </p></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>