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


@WebServlet("/update")
public class Update extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
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
	dao.update(st);
	
	res.getWriter().print("<h1>data updated successfully</h1>");

}
}
