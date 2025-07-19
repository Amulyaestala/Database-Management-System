package com.studentapp;

public class student {
	private int id;
	private String name;
	private String email;
	private String course;
	
	public student(int id,String name,String email,String course) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.course=course;
		}
	
	public student(String name,String email, String course) {
		this.name=name;
		this.email=email;
		this.course=course;
	}
	
	//getters/setters
	public int getId() {return id; }
	public void setId(int id) {this.id=id; }
	public String getname() {return name; }
	public void setname(String name) {this.name=name; }
	public String getemail() {return email; }
	public void setemail(String email) {this.email=email; }
	public String getcourse() {return course; }
	public void setcourse(String course) {this.course=course; }
	@Override
	public String toString() {
		return "ID:"+id+",name:"+name+",email:"+email+",course:"+course;
	}
	
}


