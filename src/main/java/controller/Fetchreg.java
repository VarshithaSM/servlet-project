package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import dao.Std_dao;
import dto.Student;



@WebServlet("/fetchid")
public class Fetchreg extends HttpServlet {
@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String id=req.getParameter("id");
	long reg=Long.parseLong(id);
//	String dob=req.getParameter("dat");
	
	Std_dao d=new Std_dao();	
	
	List<Student> list=d.fetchbyid(reg);
	
	req.setAttribute("studentlist", list);
	
	RequestDispatcher rd=req.getRequestDispatcher("byid.jsp");
	rd.forward(req,res);
	
}
}
