package com.rakesh.studentMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.rakesh.studentMicroService.entity.subject;
import com.rakesh.studentMicroService.entity.teacher;

public interface teacherrepo extends JpaRepository<teacher, Long>{
	
	@Query("select teacher from teacher teacher where teacher.id=?1")
	public teacher getteacher(Long teacherid);

}
