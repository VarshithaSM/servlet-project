<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update the Student Details</h1>

<form action=" ">
 <table>
 <tr>
 <th>Register number:<input type="number" name="id" value=<%=request.getParameter("id")%> readonly="readonly"></th>
</tr>
<tr>
<th>Student name:<input type="text" name="name" value=<%=request.getParameter("name")%>></th>
</tr>
<tr>
<th>Date of Birth:<input type="date" name="dob" value=<%=request.getParameter("dob")%>></th>
</tr>
<tr>
<th>Father name:<input type="text" name="fname" value=<%=request.getParameter("fname")%>></th>
</tr>
<tr>
<th>Mother name:<input type="text" name="mname" value=<%=request.getParameter("mname")%>>
</th>
</tr>

 <tr> 
 <th>Kannada:<input type="number" name="kan" value=<%=request.getParameter("kan")%>></th>
 </tr>
 <tr> 
 <th>English:<input type="number" name="eng" value=<%=request.getParameter("eng")%>></th>
 </tr>
 <tr> 
 <th>Hindi:<input type="number" name="hin" value=<%=request.getParameter("hin")%>></th>
 </tr>
 <tr> 
 <th>Mathematics:<input type="number" name="mat" value=<%=request.getParameter("mat")%>></th>
 </tr>
 <tr> 
 <th>Social Science:<input type="number" name="ss" value=<%=request.getParameter("ss")%>></th>
 </tr>
 <tr> 
 <th>Science:<input type="number" name="sci" value=<%=request.getParameter("sci")%>></th>
 </tr>
 <tr> 
 <th>Total Marks:<input type="number" name="tm" value=<%=request.getParameter("tm")%>></th>
 </tr>
 <tr>
 <th>Percentage:<input type="number" name="per" value=<%=request.getParameter("per")%>></th>
 </tr>
 </table>
 <br><br>
<button>Update</button>
<button>Cancel</button>
</form>
</body>
</html>