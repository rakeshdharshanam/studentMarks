package com.rakesh.studentMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rakesh.studentMicroService.entity.teacherlogin;

public interface teacherloginrepo extends JpaRepository<teacherlogin, Long>{

	@Query("select tl from teacherlogin tl where tl.username = ?1")
	public teacherlogin getteacherlogin(String teacherlogin);
}
