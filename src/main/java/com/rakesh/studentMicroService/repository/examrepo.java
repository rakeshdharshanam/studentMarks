package com.rakesh.studentMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakesh.studentMicroService.entity.exam;

public interface examrepo extends JpaRepository<exam, Long>{

}
