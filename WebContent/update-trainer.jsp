<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
<link rel="icon" href="images\logo3.png" />
<link rel="stylesheet" type="text/css" href="styles\style.css" />
<link rel="stylesheet"
    href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
<script src='https://kit.fontawesome.com/a076d05399.js'>
	window.history.forward();
</script>
</head>
<body id="admin">
 <c:set var="trainer" value="${trainer}"></c:set>
    <header> <nav> <a id="home-icon" href="index.jsp"> HOME</a></nav> <nav> <a
        href="trainer.jsp"> BACK</a> </nav>
        <nav><a id="logout" href="index.jsp">LOGOUT</a></nav>
        </header>
    <div id="logo" style="display: inline-block; align: center;">
        <img src="images\logo3.png" border="0" />
    </div>
    <div id="logo-name" style="display: inline-block; min-width: 3.8cm;">
        <b>ATTENDANCE MARKING</b> <br> <b>FOR CLASSROOM</b>
    </div>
    <div class="update-container">
        <form action="ShowTrainerDetails?TrainerId=${trainer.getTrainerId()}" method="post">
            <h3 align="center">Search Trainer</h3>
            <div class="input-icons">
                <i class="fa fa-search icon" aria-hidden="true"></i> <input class="input-field"
                    type="text" name="trainerId" placeholder="Trainer Id"/>
            </div>
            <table cellspacing="35">
                <tr>
                    <td></td>
                    <td><input type="submit" id="button" value="Show" /></td>
                </tr>
            </table>
        </form>
    </div>
</body>
</html>




