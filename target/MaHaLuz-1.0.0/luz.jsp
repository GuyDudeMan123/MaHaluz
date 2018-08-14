<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.main.Employee, com.main.Shifts"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html dir="rtl">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script language="JavaScript" type="text/javascript" src="js/verify.js"></script>
<title>מה הלו"ז?</title>
<link rel="icon" type="image/png" href="logo.gif" />
</head>
<body>
	<%
		try {
			Employee user = ((Employee) session.getAttribute("user"));
			String fName = user.getfName();
			String lName = user.getlName();
			String fullName = fName + " " + lName;
			out.println("שלום " + fullName + "!<br>");
			out.println("נא לבחור משמרות:");
		} catch (NullPointerException e) {
			out.println("no HttpSession found");
		}
	%>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<form id="scheduleForm" name="scheduleForm" method="post"
		action="/MaHaLuz/ScheduleServlet" onsubmit = "return verify()">
		<table align="center">
			<tr>
				<th>שעות המשמרת</th>
				<th>יום ראשון</th>
				<th>יום שני</th>
				<th>יום שלישי</th>
				<th>יום רביעי</th>
				<th>יום חמישי</th>
				<th>יום שישי</th>
			</tr>
			<tr>
				<td>07:45-16:00</td>
				<td><select id="sunday1" name="sunday1">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td><select id="monday1" name="monday1">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td><select id="tuesday1" name="tuesday1">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td><select id="wednesday1" name="wednesday1">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td><select id="thursday1" name="thursday1">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td><select id="friday1" name="friday1">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
			</tr>
			<tr>
				<td>07:45-17:00</td>
				<td><select id="sunday2" name="sunday2">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td><select id="monday2" name="monday2">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td><select id="tuesday2" name="tuesday2">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td><select id="wednesday2" name="wednesday2">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td><select id="thursday2" name="thursday2">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td></td>
			</tr>
			<tr>
				<td>08:45-18:00</td>
				<td><select id="sunday3" name="sunday3">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td><select id="monday3" name="monday3">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td><select id="tuesday3" name="tuesday3">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td><select id="wednesday3" name="wednesday3">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td><select id="thursday3" name="thursday3">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td></td>
			</tr>
			<tr>
				<td>09:45-19:00</td>
				<td><select id="sunday4" name="sunday4">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td></td>
				<td></td>
				<td></td>
				<td><select id="thursday4" name="thursday4">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td></td>
			</tr>
			<tr>
				<td>10:45-19:00</td>
				<td><select id="sunday5" name="sunday5">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td></td>
				<td></td>
				<td></td>
				<td><select id="thursday5" name="thursday5">
						<option value="">בחר</option>
						<option value="true">יכול</option>
						<option value="false">לא יכול</option>
				</select></td>
				<td></td>
			</tr>
			<tr></tr>
			<tr>
				<td><button type="submit">אישור</button></td>
			</tr>
		</table>

	</form>
</body>
</html>