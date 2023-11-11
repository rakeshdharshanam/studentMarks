package com.rakesh.studentMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakesh.studentMicroService.entity.teacher;

public interface teacherrepo extends JpaRepository<teacher, Long>{

}
