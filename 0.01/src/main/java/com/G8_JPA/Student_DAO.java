package com.G8_JPA;

public class Student_DAO {
	public Student_DAO(int student_id, String student_name, int subject_id) {
		super();
		this.Student_id = student_id;
		this.Student_name = student_name;
		this.Subject_id = subject_id;
	}
	private int Student_id;
	private String Student_name;
	private int Subject_id;
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		this.Student_id = student_id;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		this.Student_name = student_name;
	}
	public int getSubject_id() {
		return Subject_id;
	}
	public void setSubject_id(int subject_id) {
		this.Subject_id = subject_id;
	}
	
   
}
