<%@page import="dto.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% List<Student> l1=(List<Student>) request.getAttribute("studentlist"); %>
<% for(Student a:l1) { %>
<table border=" " cellpadding="10px" width="500px">

<tr>
<th >Register number</th> <td><%=a.getRegister_number() %></td>
</tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr>
<th>Student name</th> 
<th>Date of Birth</th>
</tr>
<tr>
<td><%=a.getStudent_name() %></td>
<td align="center"><%=a.getDate_of_birth() %></td></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr>
<th>Father name</th> <td><%=a.getFather_name()%></td>

<th>Mother name</th><td><%=a.getMother_name() %></td>
</tr>
</table>
<br>
<table border="" width="500px" height="400px" cellpadding="10px">
<tr>
<th>Subjects</th> 
<th>Marks</th>
<tr>
<th>Kannada</th>  <td align="center"><%=a.getKannada() %></td>
</tr>
<tr>
<th>English</th>  <td align="center"><%=a.getEnglish() %></td>
</tr>
<tr>
<th>Hindi</th>  <td align="center"><%=a.getHindi() %></td>
</tr>
<tr>
<th>Mathematics</th> <td align="center"><%=a.getMathematics() %></td>
</tr>
<tr>
<th>Social science</th>   <td align="center"><%=a.getSocial_science() %></td>
</tr>
<tr>
<th>Science</th>  <td align="center"><%=a.getScience() %></td>
</tr>
<tr>
 <th>Total Marks</th> <td align="center"><%=a.getTotal_marks() %></td>
</tr>
<tr>
<th>Percentage %</th> <td align="center"><%=a.getPercentage() %></td>
</tr>
<%} %>
</table>
</body>
</html>