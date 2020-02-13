function ageCount() {
	var date1 = new Date();
	var dob = document.getElementById("dob").value;
	var date2 = new Date(dob);
	var y1 = date1.getFullYear();
	var y2 = date2.getFullYear();
	var age = y1 - y2;
	document.getElementById("age").value = age;
	doucment.getElementById("age").focus();
	return true;
}
function validateAdminRegistrationForm() {
	var firstName = document.forms["attendance"]["firstName"].value;
	var firstNameRegExp = (/^.*[0-9].*$/);
	if (firstName == "") {
		alert("FirstName should not be empty");
		document.getElementById('firstName').style.borderColor = "red";
		return false;
	} else if (firstName.match(firstNameRegExp)) {
		alert("FirstName should not contain numbers");
		document.getElementById('firstName').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('firstName').style.borderColor = "white";
	}
	var lastName = document.forms["attendance"]["lastName"].value;
	var lastNameRegExp = (/^.*[0-9].*$/);
	if (lastName == "") {
		alert("Please Enter Last Name");
		document.getElementById('lastName').style.borderColor = "red";
		return false;
	} else if (lastName.match(lastNameRegExp)) {
		alert("LastName should not contain numbers");
		document.getElementById('lastName').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('lastName').style.borderColor = "white";
	}
	var dob = document.forms["attendance"]["dob"].value;
	if (dob == "") {
		alert("Please select your Date Of Birth");
		document.getElementById('dob').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('dob').style.borderColor = "white";
	}
	var gender = document.forms["attendance"]["gender"].value;
	if (gender == "") {
		alert("Please select your gender");
		document.getElementById('radio').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('radio').style.borderColor = "white";
	}
	var contact = document.forms["attendance"]["contactNumber"].value;
	var contactNameRegExp = (/^[9876]\d{9}$/);
	if (contact == "") {
		alert("Please Enter Contact");
		document.getElementById('contactNumber').style.borderColor = "red";
		return false;
	} else if (!contact.match(contactNameRegExp)) {
		alert("Enter only numbers and it should starts with 9876 and it should be 10 digits");
		document.getElementById('contactNumber').style.borderColor = "red";
		return false;
	} 
	/*else if(!contact.match(contactNameRegExp1)){
		alert("Contact Number should start with 9/8/7/6");
		document.getElementById('contactNumber').style.borderColor = "red";
		return false;
	}
	else if(contact.length<10||contact.length>10){
		alert("Please enter 10 numbers");
		document.getElementById('contactNumber').style.borderColor = "red";
		return false;
	}*/
	else {
		document.getElementById('contactNumber').style.borderColor = "white";
	}
	var adminId = document.forms["attendance"]["adminId"].value;
	var adminIdNameRegExp = (/^.*[0-9].*$/);
	if (adminId == "") {
		alert("Please Enter Admin Id");
		document.getElementById('adminId').style.borderColor = "red";
		return false;
	} else if (!adminId.match(adminIdNameRegExp)) {
		alert("Enter only numbers");
		document.getElementById('adminId').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('adminId').style.borderColor = "white";
	}
	var password = document.forms["attendance"]["password"].value;
	if (password == "") {
		alert("Please Enter Password");
		document.getElementById('password').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('password').style.borderColor = "white";
		alert("Your details Saved Succesfully");
	}
}
function validateUserRegistrationForm() {
	var firstName = document.forms["attendance"]["firstName"].value;
	var firstNameRegExp = (/^.*[0-9].*$/);
	if (firstName == "") {
		alert("FirstName should not be empty");
		document.getElementById('firstName').style.borderColor = "red";
		return false;
	} else if (firstName.match(firstNameRegExp)) {
		alert("FirstName should not contain numbers");
		document.getElementById('firstName').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('firstName').style.borderColor = "white";
	}
	var lastName = document.forms["attendance"]["lastName"].value;
	var lastNameRegExp = (/^.*[0-9].*$/);
	if (lastName == "") {
		alert("Please Enter Last Name");
		document.getElementById('lastName').style.borderColor = "red";
		return false;
	} else if (lastName.match(lastNameRegExp)) {
		alert("LastName should not contain numbers");
		document.getElementById('lastName').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('lastName').style.borderColor = "white";
	}
	var empId = document.forms["attendance"]["employeeId"].value;
	var empIdNameRegExp = (/^.*[0-9].*$/);
	if (empId == "") {
		alert("Please Enter Employee Id");
		document.getElementById('employeeId').style.borderColor = "red";
		return false;
	} else if (!empId.match(empIdNameRegExp)) {
		alert("Enter only numbers");
		document.getElementById('employeeId').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('employeeId').style.borderColor = "white";
	}
	var emailId = document.forms["attendance"]["email"].value;
	var emailNameRegExp = (/^[a-zA-Z0-9]+[@][a-zA-z]+[.][a-zA-z]+$/)
	if (emailId == "") {
		alert("Please Enter Email Id");
		document.getElementById('email').style.borderColor = "red";
		return false;
	} else if (!emailId.match(emailNameRegExp)) {
		alert("Enter valid Email-Id");
		document.getElementById('email').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('email').style.borderColor = "white";
	}
	var password = document.forms["attendance"]["password"].value;
	if (password == "") {
		alert("Please Enter Password");
		document.getElementById('password').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('password').style.borderColor = "white";
		alert("Your details Saved Succesfully");
	}
}
function validateAddTrainerForm() {
	var trainerId = document.forms["attendance"]["trainerId"].value;
	var trainerIdNameRegExp = (/^.*[0-9].*$/);
	if (trainerId == "") {
		alert("Please Enter Trainer Id");
		document.getElementById('trainerId').style.borderColor = "red";
		return false;
	} else if (!trainerId.match(trainerIdNameRegExp)) {
		alert("Enter only numbers");
		document.getElementById('trainerId').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('trainerId').style.borderColor = "white";
	}
	var trainerName = document.forms["attendance"]["trainerName"].value;
	var trainerNameRegExp = (/^.*[0-9].*$/);
	if (trainerName == "") {
		alert("TrainerName should not be empty");
		document.getElementById('trainerName').style.borderColor = "red";
		return false;
	} else if (trainerName.match(trainerNameRegExp)) {
		alert("TrainerName should not contain numbers");
		document.getElementById('trainerName').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('trainerName').style.borderColor = "white";
	}
	var contact = document.forms["attendance"]["contactNumber"].value;
	var contactNameRegExp = (/^.*[0-9].*$/);
	if (contact == "") {
		alert("Please Enter Contact");
		document.getElementById('contactNumber').style.borderColor = "red";
		return false;
	} else if (!contact.match(contactNameRegExp)) {
		alert("Enter only numbers");
		document.getElementById('contactNumber').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('contactNumber').style.borderColor = "white";
	}
	var email = document.forms["attendance"]["email"].value;
	var emailNameRegExp = (/^[a-zA-Z0-9]+[@][a-zA-z]+[.][a-zA-z]+$/)
	if (email == "") {
		alert("Please Enter Email Id");
		document.getElementById('email').style.borderColor = "red";
		return false;
	} else if (!email.match(emailNameRegExp)) {
		alert("Enter valid Email-Id");
		document.getElementById('email').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('email').style.borderColor = "white";
	}
	var skillId = document.forms["attendance"]["skillId"].value;
	if (skillId == "") {
		alert("Please Enter SkillId");
		document.getElementById('skillId').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('skillId').style.borderColor = "white";
	}
}
function validateAddSessionForm() {
	var sessionId = document.forms["attendance"]["sessionId"].value;
	if (sessionId == "") {
		alert("Please select the SessionId");
		document.getElementById('sessionId').style.borderColor = "red";
		return false;
	}
	var sessionDescription = document.forms["attendance"]["sessionDescription"].value;
	var sessionDescriptionRegExp = (/^.*[0-9].*$/);
	if (sessionDescription == "") {
		alert("Session description should not be empty");
		document.getElementById('sessionDescription').style.borderColor = "red";
		return false;
	} else if (sessionDescription.match(sessionDescriptionRegExp)) {
		alert("Session description should not contain numbers");
		document.getElementById('sessionDescription').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('sessionDescription').style.borderColor = "white";
	}
	var skillSet = document.forms["attendance"]["skillId"].value;
	var skillSetRegExp = (/^.*[0-9].*$/);
	if (skillSet == "") {
		alert("SkillSet should not be empty");
		document.getElementById('skillId').style.borderColor = "red";
		return false;
	} else if (skillSet.match(skillSetRegExp)) {
		alert("SkillSet should not contain numbers");
		document.getElementById('skillId').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('skillId').style.borderColor = "white";
	}
	var sessionDate = document.forms["attendance"]["date"].value;
	if (sessionDate == "") {
		alert("Please select the Session Date");
		document.getElementById('date').style.borderColor = "red";
		return false;
	}
	var sessionTime = document.forms["attendance"]["time"].value;
	if (sessionTime == "") {
		alert("Session Time should not be empty");
		document.getElementById('time').style.borderColor = "red";
		return false;
	}
	var availableSlots = document.forms["attendance"]["availableSlots"].value;
	if (availableSlots == "") {
		alert("Available Slots should not be empty");
		document.getElementById('availableSlots').style.borderColor = "red";
		return false;
	}
}

function validateAddSkillForm() {
	var skillId = document.forms["attendance"]["skillId"].value;
	if (skillId == "") {
		alert("Please select the SkillId");
		document.getElementById('skillId').style.borderColor = "red";
		return false;
	}
	var skillType = document.forms["attendance"]["skillType"].value;
	if (skillType == "") {
		alert("Skill Type should not be empty");
		document.getElementById('skillType').style.borderColor = "red";
		return false;
	}
	var skillDescription = document.forms["attendance"]["skillDescription"].value;
	if (skillDescription == "") {
		alert("Skill Description should not be empty");
		document.getElementById('skillDescription').style.borderColor = "red";
		return false;
	}
}
function validateMapSkillForm() {
	var skillId = document.forms["attendance"]["skill-id"].value;
	if (skillId == "") {
		alert("Please select the SkillId");
		document.getElementById('skill-id').style.borderColor = "red";
		return false;
	}
	var sessionId = document.forms["attendance"]["session-id"].value;
	if (sessionId == "") {
		alert("Please select the SessionId");
		document.getElementById('session-id').style.borderColor = "red";
		return false;
	}
}
function validateAdminLoginForm() {
	var adminId = document.forms["attendance"]["adminId"].value;
	if (adminId == "") {
		alert("Please Enter Admin Id");
		document.getElementById('adminId').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('adminId').style.borderColor = "white";
	}
	var password = document.forms["attendance"]["password"].value;
	if (password == "") {
		alert("Please Enter Password");
		document.getElementById('password').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('adminId').style.borderColor = "white";
	}
}
function validateUserLoginForm() {
	var employeeId = document.forms["attendance"]["employeeId"].value;
	if (employeeId == "") {
		alert("Please Enter Employee Id");
		document.getElementById('employeeId').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('employeeId').style.borderColor = "white";
	}
	var password = document.forms["attendance"]["password"].value;
	if (password == "") {
		alert("Please Enter Password");
		document.getElementById('password').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('password').style.borderColor = "white";
	}
}
function validateUpdateTrainerForm() {
	var trainerId = document.forms["attendance"]["trainerId"].value;
	if (trainerId == "") {
		alert("Please Enter TrainerId");
		document.getElementById('trainerId').style.borderColor = "red";
		return false;
	} else {
		document.getElementById('trainerId').style.borderColor = "white";
	}
}