package com.rakesh.studentMicroService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class exam {

	@Id
	private Long id;
	private String name;
	private Long maxmarks;
	
	
	public Long getMaxmarks() {
		return maxmarks;
	}
	public void setMaxmarks(Long maxmarks) {
		this.maxmarks = maxmarks;
	}
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
	
	
}
