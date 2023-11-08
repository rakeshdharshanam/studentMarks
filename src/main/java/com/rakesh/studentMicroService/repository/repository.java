package com.rakesh.studentMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rakesh.studentMicroService.entity.student;

public interface repository extends JpaRepository<student, Long> {

	
}
