package com.rakesh.studentMicroService.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class teacher {
	
	@Id
	private Long id;
	private String name;

	@OneToMany
	private List<subject> subjects;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<subject> subjects) {
		this.subjects = subjects;
	}

	
	
	
	
}
