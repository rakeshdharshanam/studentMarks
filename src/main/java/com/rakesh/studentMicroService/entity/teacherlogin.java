package com.rakesh.studentMicroService.entity;

import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

public class teacherlogin {
	
	@Id
	private Long id;
	private String username;
	private String password;
	@OneToOne
	private teacher teacher;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(teacher teacher) {
		this.teacher = teacher;
	}
	
	
	
}
