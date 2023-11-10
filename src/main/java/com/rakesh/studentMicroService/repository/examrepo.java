package com.rakesh.studentMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rakesh.studentMicroService.entity.college;
import com.rakesh.studentMicroService.entity.exam;

public interface examrepo extends JpaRepository<exam, Long>{

	@Query("select e from exam e where e.name = ?1")
	public exam getexamname(String examname);
	
}
