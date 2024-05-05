<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<jsp:include page="Jailer.jsp" />
	<center>
		<table border=2>
			<tr>
				
				<th>CriminalName</th>
				<th>Crime</th>
				<th>YearofRealse</th>
				<th>PunishmentPeriod</th>
				<th>khadhino</th>
				
			</tr>

			
			
				<tr>
					<td>${ crm.name   }</td>
					<td>${ crm.crime }</td>
					<td>${ crm.dateofrealse  }</td>
					<td>${ crm.punishmentperiod  }</td>
					<td>${ crm.khadhino }</td>
				    
					
				</tr>
		</table>
	</center>
</body>
</html>