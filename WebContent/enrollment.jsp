<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enrollment</title>
<link rel="icon" href="images\logo3.png" />
<link rel="stylesheet" type="text/css" href="styles\style.css" />
</head>
<body id="admin">
    <header> <nav> <a id="home-icon" href="index.jsp"> HOME</a></nav> <nav> <a
        href="user.jsp"> BACK</a> </nav></header>
    <div id="logo" style="display: inline-block; align: center;">
        <img src="images\logo3.png" border="0" />
    </div>
    <div id="logo-name" style="display: inline-block; min-width: 3.8cm;">
        <b>ATTENDANCE MARKING</b> <br> <b>FOR CLASSROOM</b>
    </div>
    <div class="container">
        <form action="enrollment.jsp" method="post">
            <table cellspacing="35">
                <tr>
                    <td><label for="skill-id"><b>Skill ID </b></label></td>
                    <td><input type="text" id="skill-id" name="skill-id" /></td>
                </tr>
                <tr>
                    <td><label for="session-id"><b>Session ID</b></label></td>
                    <td><input type="text" id="session-id" name="session-id" /></td>
                </tr>
                <tr>
                    <td><label for="employee-id"><b>Employee ID</b></label></td>
                    <td><input type="text" id="employee-id" name="employee-id" /></td>
                </tr>
                <tr>
                    <td><label for="first-name"><b>First Name</b></label></td>
                    <td><input type="text" id="first-name" name="first-name" /></td>
                </tr>
                <tr>
                    <td><label for="status"><b>Status</b></label></td>
                    <td><select name="status" id="status">
                            <option value="">select status</option>
                            <option value="approve" id="status">Approve</option>
                            <option value="reject" id="status">Reject</option>
                    </select></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" id="button" value="Enroll" /></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>
