 <%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<body bgcolor="lavender">
<h1><center>Charity Trust</center></h1>
		
		
		 <!--  Fill the code -->
		 <center>
		 <table border="1" cellpadding="10" cellspacing="0">
		 	<thead>
		 		<tr>
		 			<th>Sponsor Name</th>
		 			<th>Phone Number</th>
		 			<th>Donation For</th>
		 			<th>Date</th>
		 			<th>Amount</th>
		 		</tr>
		 	</thead>
		 	<tbody>
		 		<c:forEach items="${fundList}" var="sponsor">
		 			<tr>
		 				<td>${sponsor.sponsorName}</td>
		 				<td>${sponsor.phoneNumber}</td>
		 				<td>${sponsor.donationFor}</td>
		 				<td>${sponsor.date}</td>
		 				<td>${sponsor.amount}</td>
		 			</tr>
		 		</c:forEach>
		 	</tbody>
		 </table>
		 </center>
		
	<center>	<a href="index">Back to Home</a>	</center>
	
	<br>
	<br>
	
</body>
</html>