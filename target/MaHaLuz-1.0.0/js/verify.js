/**
 * verify scheduleForm
 */

function verify() {
	for (var i = 0; i < 20; i++) {
		var x = document.getElementById("scheduleForm").elements[i].value;
		if (x == "") {
			alert("נא לבחור את כל המשמרות.")
			return false;
		}
	}
	alert("משמרות נשלחו בהצלחה!")
	return true;
}