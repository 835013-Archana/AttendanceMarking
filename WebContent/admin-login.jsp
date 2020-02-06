<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
<link rel="icon" href="images\logo3.png" />
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
    <h1>${ref1}</h1>
     <c:if test="${status==false}">
        <h4 id="save">Invalid adminId and password</h4>
    </c:if>
    <div class="container-admin">
        <form action="AdminLogin" method="post">
            <table cellspacing="15">
                <tr>
                    <td><label for="adminId"><b>Admin Id</b></label></td>
                    <td><input type="text" id="adminId" name="adminId" /></td>
                </tr>
                <tr>
                    <td><label for="password"><b>Password</b></label></td>
                    <td><input type="text" id="password" name="password" /></td>
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
</body>
</html>