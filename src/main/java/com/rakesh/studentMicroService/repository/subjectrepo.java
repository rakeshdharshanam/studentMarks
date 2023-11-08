package com.rakesh.studentMicroService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rakesh.studentMicroService.entity.subject;

public interface subjectrepo extends JpaRepository<subject, Long> {

}
