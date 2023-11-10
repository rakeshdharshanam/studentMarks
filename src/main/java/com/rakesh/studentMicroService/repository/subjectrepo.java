package com.rakesh.studentMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rakesh.studentMicroService.entity.subject;

public interface subjectrepo extends JpaRepository<subject, Long> {

	@Query("select sub from subject sub where sub.name=?1")
	public subject getsubjectname(String subjectname);
	
	
	
}
