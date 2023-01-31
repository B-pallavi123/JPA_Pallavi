package com.G8_JPA;

public class Teacher_DAO {
	  public Teacher_DAO(int teacher_id, String teacher_name, int subject_id) {
		super();
		this.Teacher_id = teacher_id;
		this.Teacher_name = teacher_name;
		this.Subject_id = subject_id;
	}
	private int Teacher_id;
      private String Teacher_name;
      private  int Subject_id;
	public int getTeacher_id() {
		return Teacher_id;
	}
	public void setTeacher_id(int teacher_id) {
		this.Teacher_id = teacher_id;
	}
	public String getTeacher_name() {
		return Teacher_name;
	}
	public void setTeacher_name(String teacher_name) {
		this.Teacher_name = teacher_name;
	}
	public int getSubject_id() {
		return Subject_id;
	}
	public void setSubject_id(int subject_id) {
		this.Subject_id = subject_id;
	}
}
