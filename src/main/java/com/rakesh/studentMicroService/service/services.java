package com.rakesh.studentMicroService.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rakesh.studentMicroService.entity.*;
import com.rakesh.studentMicroService.repository.collegerepo;
import com.rakesh.studentMicroService.repository.repository;

@Service
public class services {
	
	@Autowired
	private repository r;
	
	@Autowired
	private collegerepo collegerepo;
	
	
	
	public ArrayList<student> getStudentsService(){
		
		return (ArrayList<student>) r.findAll();
	}
	
	
	public void addStudent(student st) {
//		college c = collegerepo.getById(st.getCollege().getId());
//		st.setCollege(c);
		r.save(st);
	}
	
	public student updatestudent(student st) {
		r.save(st);
		return r.getOne(st.getId());
	}
	
	public ArrayList<student> deletestudent(long id){
		r.deleteById(id);
		return (ArrayList<student>)r.findAll();
	}
	
	
	
}
