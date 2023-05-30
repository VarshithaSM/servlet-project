<%@page import="java.util.List"%>
<%@page import="dto.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% List<Student> l2=(List<Student>) request.getAttribute("studentli"); %>
<% for(Student b:l2) { %>
<table border=" " cellpadding="10px" width="500px">
<tr>
<th >Register number</th> <td><%=b.getRegister_number() %></td>
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
<td><%=b.getStudent_name() %></td>
<td align="center"><%=b.getDate_of_birth() %></td></tr>
<tr></tr>
<tr></tr>
<tr></tr>
<tr>
<th>Father name</th> <td><%=b.getFather_name()%></td>
<th>Mother name</th><td><%=b.getMother_name() %></td>
</tr>

<tr></tr>
<tr></tr>
<tr></tr>

<tr>
<th>Subjects</th> 
<th>Marks</th>
<tr>
<th>Kannada</th>  <td align="center"><%=b.getKannada() %></td>
</tr>
<tr>
<th>English</th>  <td align="center"><%=b.getEnglish() %></td>
</tr>
<tr>
<th>Hindi</th>  <td align="center"><%=b.getHindi() %></td>
</tr>
<tr>
<th>Mathematics</th> <td align="center"><%=b.getMathematics() %></td>
</tr>
<tr>
<th>Social science</th>   <td align="center"><%=b.getSocial_science() %></td>
</tr>
<tr>
<th>Science</th>  <td align="center"><%=b.getScience() %></td>
</tr>
<tr>
 <th>Total Marks</th> <td align="center"><%=b.getTotal_marks() %></td>
</tr>
<tr>
<th>Percentage %</th> <td align="center"><%=b.getPercentage() %></td>
</tr>
<%} %>
</table>
</body>
</html>