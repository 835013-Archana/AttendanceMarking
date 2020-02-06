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
    <header> <nav> <a id="home-icon" href="index.jsp"> HOME</a></nav> <nav> <a
        href="trainer.jsp"> BACK</a> </nav></header>
    <div id="logo" style="display: inline-block; align: center;">
        <img src="images\logo3.png" border="0" />
    </div>
    <div id="logo-name" style="display: inline-block; min-width: 3.8cm;">
        <b>ATTENDANCE MARKING</b> <br> <b>FOR CLASSROOM</b>
    </div>
   <%--  <c:if test="${skill-status==false}">
        <h4 id="save">your Details Saved Successfully</h4>
    </c:if> --%>
    <div class="skill-container">
        <form action="AddSkillDetails" method="post">
            <table cellspacing="35">
                <tr>
                    <td><label for="skill-id"><b>Skill ID </b></label></td>
                    <td><input type="text" id="skill-id" name="skillId" /></td>
                </tr>
                <tr>
                    <td><label for="skill-type"><b>Skill Type</b></label></td>
                    <td><input type="text" id="skill-type" name="skillType" /></td>
                </tr>
                <tr>
                    <td><label for="skill-description"><b>Skill Description</b></label></td>
                    <td><input type="text" id="skill-description" name="SkillDescription" /></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" id="button" value="Add Skill" /></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>




