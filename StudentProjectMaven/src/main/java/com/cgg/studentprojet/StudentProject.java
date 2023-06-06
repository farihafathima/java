package com.cgg.studentprojet;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class StudentProject {
	@Id
	@Column(name="student_id")
	private int id;
	
	@Column(name="student_name")
	private String Name;
	
	@Column(name="student_phone")
	private String phone;
	
	@Column(name="student_city")
	private String city;
	
	
	public StudentProject() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentProject(int id, String name, String phone, String city) {
		super();
		this.id = id;
		Name = name;
		this.phone = phone;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	
	
	
	
	

}
