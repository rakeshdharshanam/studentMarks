package com.rakesh.studentMicroService.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class subject {
	
	@Id
	private Long id;
	private String name;
	
	@ManyToMany
	private List<student> student;

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

	public List<student> getStudent() {
		return student;
	}

	public void setStudent(List<student> student) {
		this.student = student;
	}
	
	

	
}
