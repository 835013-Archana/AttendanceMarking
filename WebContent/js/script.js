function validateAttendanceForm() {
    var FirstName = document.forms["Admin"]["FirstName"].value;
    if (FirstName == "") {
        alert("Title is required.");
    	document.getElementById("FirstName").style.backgroundColor = "lightblue";
        return false;
    }
    if (FirstName.length < 2 || FirstName.length > 100) {
        alert("Title should have 2 to 100 characters.");
        return false;
    }
}