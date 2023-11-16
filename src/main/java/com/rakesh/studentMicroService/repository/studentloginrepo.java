package com.rakesh.studentMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rakesh.studentMicroService.entity.studentlogin;
import com.rakesh.studentMicroService.entity.teacherlogin;

public interface studentloginrepo extends JpaRepository<studentlogin, Long>{

	@Query("select sl from studentlogin sl where sl.username = ?1")
	public studentlogin getstudentlogin(String studentlogin);
	
	@Query("select sl.password from studentlogin sl where sl.username = ?1")
	public String getpassword(String username);
}
