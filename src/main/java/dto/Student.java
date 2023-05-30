package dto;


import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class Student {
	@Id
long register_number;
String student_name;
String date_of_birth;
String father_name;
String mother_name;
int kannada;
int english;
int hindi;
int mathematics;
int social_science;
int science;
int total_marks;
double percentage;
public long getRegister_number() {
	return register_number;
}
public void setRegister_number(long register_number) {
	this.register_number = register_number;
}
public String getStudent_name() {
	return student_name;
}
public void setStudent_name(String student_name) {
	this.student_name = student_name;
}
public String getDate_of_birth() {
	return date_of_birth;
}
public void setDate_of_birth(String dob) {
	this.date_of_birth = dob;
}
public String getFather_name() {
	return father_name;
}
public void setFather_name(String father_name) {
	this.father_name = father_name;
}
public String getMother_name() {
	return mother_name;
}
public void setMother_name(String mother_name) {
	this.mother_name = mother_name;
}
public int getKannada() {
	return kannada;
}
public void setKannada(int kannada) {
	this.kannada = kannada;
}
public int getEnglish() {
	return english;
}
public void setEnglish(int english) {
	this.english = english;
}
public int getHindi() {
	return hindi;
}
public void setHindi(int hindi) {
	this.hindi = hindi;
}
public int getMathematics() {
	return mathematics;
}
public void setMathematics(int mathematics) {
	this.mathematics = mathematics;
}
public int getSocial_science() {
	return social_science;
}
public void setSocial_science(int social_science) {
	this.social_science = social_science;
}
public int getScience() {
	return science;
}
public void setScience(int science) {
	this.science = science;
}
public int getTotal_marks() {
	return total_marks;
}
public void setTotal_marks(int total_marks) {
	this.total_marks = total_marks;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
}
