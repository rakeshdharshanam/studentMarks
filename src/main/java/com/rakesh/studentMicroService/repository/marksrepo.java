package com.rakesh.studentMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakesh.studentMicroService.entity.marks;

public interface marksrepo extends JpaRepository<marks, Long>{

}
