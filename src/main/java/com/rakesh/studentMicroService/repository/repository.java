package com.rakesh.studentMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rakesh.studentMicroService.entity.student;

public interface repository extends JpaRepository<student, Long> {

	@Query("select stu from student stu where stu.name = ?1")
	public student getstudentname(String studentname);
	
}
