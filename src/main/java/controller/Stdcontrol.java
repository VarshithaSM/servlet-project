package controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.Std_dao;
import dto.Student;


@WebServlet("/insert")
public class Stdcontrol extends GenericServlet {
@Override
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	String regno=req.getParameter("id");
	String name=req.getParameter("name");
	String dob=req.getParameter("dob");
	String fname=req.getParameter("fname");
	String mname=req.getParameter("mname");
	String kan=req.getParameter("kan");
	String eng=req.getParameter("eng");
	String hin=req.getParameter("hin");
	String math=req.getParameter("mat");
	String ss=req.getParameter("ss");
	String sc=req.getParameter("sci");
	String tm=req.getParameter("tm");
	String percen=req.getParameter("per");
	
	long reg=Long.parseLong(regno);
	
	int ka=Integer.parseInt(kan);
	int en=Integer.parseInt(eng);
	int hi=Integer.parseInt(hin);
	int ma=Integer.parseInt(math);
	int so=Integer.parseInt(ss);
	int s=Integer.parseInt(sc);
	int tot=Integer.parseInt(tm);
	double perc=Double.parseDouble(percen);
	
	Student st=new Student();
	st.setRegister_number(reg);
	st.setStudent_name(name);
	st.setDate_of_birth(dob);
	st.setFather_name(fname);
	st.setMother_name(mname);
	st.setKannada(ka);
	st.setEnglish(en);
	st.setHindi(hi);
	st.setMathematics(ma);
	st.setSocial_science(so);
	st.setScience(s);
	st.setTotal_marks(tot);
	st.setPercentage(perc);
	
	Std_dao dao=new Std_dao();
	dao.insert(st);
	
	res.getWriter().print("<h1>Details of "+name+" is Inserted</h1>");
}
}
