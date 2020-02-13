<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
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
    <header> <nav> <a id="home-icon" href="index.jsp"> HOME</a></nav> </header>
    <div id="logo">
        <img src="images\logo3.png" border="0" />
    </div>
    <div id="logo-name">
        <b>ATTENDANCE MARKING</b> <br> <b>FOR CLASSROOM</b>
    </div>
    <div class="container">
        <form name="attendance" action="AdminRegistration" autocomplete="off"
            onsubmit="return validateAdminRegistrationForm()" method="post">
            <div class="input-icons">
                <h3 align="center">Registration</h3>
                <i class="fas fa-user-alt icon" aria-hidden="true"></i> <input class="input-field"
                    type="text" name="firstName" id="firstName" placeholder="FirstName" size="2" />
            </div>
            <div class="input-icons">
                <i class="fas fa-user-alt icon" aria-hidden="true"></i> <input class="input-field"
                    type="text" name="lastName" id="lastName" placeholder="LastName" size="2" />
            </div>
            <div class="input-icons">
                <i class="fas fa-calendar-check icon" aria-hidden="true"></i> <input
                    class="input-field" type="date" name="dob" id="dob" onblur="ageCount(this)"
                    placeholder="Date Of Birth" /> &nbsp;
            </div>
            <div class="input-icons">
                <i class="fas fa-calendar-check icon" aria-hidden="true"></i> <input
                    class="input-field" type="text" name="age" id="age" /> &nbsp;
            </div>
            <div class="input-icons">
                <i class=" fas fa-male icon" aria-hidden="true"></i><input id="radio" type="radio"
                    name="gender" value="male" />Male <i class=" fas fa-female icon"
                    aria-hidden="true"></i><input id="radio" type="radio" name="gender"
                    value="female" />Female
            </div>
            <div class="input-icons">
                <i class="fas fa-phone-alt icon" aria-hidden="true"></i> <input class="input-field"
                    type="text" name="contactNumber" id="contactNumber" placeholder="Contact Number"
                    size="2" />
            </div>
            <div class="input-icons">
                <i class="fas fa-user-shield icon" aria-hidden="true"></i> <input
                    class="input-field" type="text" name="adminId" id="adminId"
                    placeholder="Admin Id" size="2" />
            </div>
            <div class="input-icons">
                <i class="fas fa-lock icon" aria-hidden="true"></i> <input class="input-field"
                    type="password" name="password" id="password" placeholder="Password" size="2" />
            </div>
            <div class="input-icons">
                <input class="input-field"
                    type="hidden" name="status" id="status" value="Pending" readonly size="2" />
            </div>
            <table>
                <tr>
                    <td><input type="submit" id="register1" value="Register" /></td>
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