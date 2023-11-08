package com.rakesh.studentMicroService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rakesh.studentMicroService.entity.college;

public interface collegerepo extends JpaRepository<college, Long> {

	@Query("select c.name from college c")
	public List<String> getcollegenames();
}
