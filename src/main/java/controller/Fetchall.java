package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Std_dao;
import dto.Student;


@WebServlet("/fall")
public class Fetchall extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	Std_dao dao=new Std_dao();
	List<Student> list=dao.fetchAll();
	
	req.setAttribute("studentli", list);
	
	RequestDispatcher rd=req.getRequestDispatcher("all.jsp");
	rd.forward(req,res);
	
	res.getWriter().print("<h1>Details of All Student</h1>");
}
}
