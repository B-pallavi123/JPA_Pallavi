package com.G8_JPA;

public class Subject_DAO {
	public Subject_DAO(int subject_id, int subject_name) {
		super();
		this.Subject_id = subject_id;
		this.Subject_name = subject_name;
	}
	private int Subject_id;
	private int Subject_name;
	public int getSubject_id() {
		return Subject_id;
	}
	public void setSubject_id(int subject_id) {
		this.Subject_id = subject_id;
	}
	public int getSubject_name() {
		return Subject_name;
	}
	public void setSubject_name(int subject_name) {
		this.Subject_name = subject_name;
	}
	
	
	
	
	
	
	
	
	
	
	
}
