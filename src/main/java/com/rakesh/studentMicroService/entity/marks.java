package com.rakesh.studentMicroService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class marks {

	@Id
	private Long id;
	private long mark;
	
	@ManyToOne
	private subject subject;
	
	@ManyToOne
	private student student;
	
	@ManyToOne
	private exam exam;

	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	

	public long getMark() {
		return mark;
	}

	public void setMark(long mark) {
		this.mark = mark;
	}

	public subject getSubject() {
		return subject;
	}

	public void setSubject(subject subject) {
		this.subject = subject;
	}

	public student getStudent() {
		return student;
	}

	public void setStudent(student student) {
		this.student = student;
	}

	public exam getExam() {
		return exam;
	}

	public void setExam(exam exam) {
		this.exam = exam;
	}
	
	
	
}
