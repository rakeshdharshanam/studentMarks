package com.rakesh.studentMicroService.controller;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.studentMicroService.entity.college;
import com.rakesh.studentMicroService.entity.exam;
import com.rakesh.studentMicroService.entity.marks;
import com.rakesh.studentMicroService.entity.student;
import com.rakesh.studentMicroService.entity.subject;
import com.rakesh.studentMicroService.repository.collegerepo;
import com.rakesh.studentMicroService.repository.*;
import com.rakesh.studentMicroService.repository.repository;
import com.rakesh.studentMicroService.service.services;

@RestController
public class restcontroller {
	
	@Autowired
	private services s;
	
	@Autowired
	private repository studentrepo;
	
	@Autowired
	private collegerepo collegerepo;
	
	@Autowired
	private subjectrepo subjectrepo;
	
	@Autowired
	private examrepo examrepo;
	
	@Autowired
	private marksrepo marksrepo;
	
	@RequestMapping("/hello")
	public String hello(){
		return "hi rakesh";
	}
	
	
//	college
	@RequestMapping(method = RequestMethod.POST,value="/addcollege")
	public List<college> addCollege(@RequestBody college c){
		collegerepo.save(c);
		return (ArrayList<college>)collegerepo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/getcollege")
	public List<college> getcollege(){
		return (ArrayList<college>)collegerepo.findAll();
	}
		
	@RequestMapping(method = RequestMethod.GET,value = "/getcollegenames")
	public List<String> getcollegenames(){
		return collegerepo.getcollegenames();
	}
	
//	subject
	@RequestMapping(method = RequestMethod.POST,value="/addsubject")
	public List<subject> addCourse(@RequestBody subject s){	
	subjectrepo.save(s);
	return (ArrayList<subject>) subjectrepo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/getsubject")
	public List<subject> getcourses(){
		return (ArrayList<subject>) subjectrepo.findAll();
	}
	
	
//	student
	@RequestMapping("/getstudents")
	public ArrayList<student> getStudents(){
		return s.getStudentsService();
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/addstudent")
	public ArrayList<student> saveStudent(@RequestBody student st) {
		s.addStudent(st);
		return (ArrayList<student>) studentrepo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/updatestudent")
	public student updatestudent(@RequestBody student st) {
		return s.updatestudent(st);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/deletestudent/{id}")
	public ArrayList<student> deletestudent(@PathVariable Long id){
		return s.deletestudent(id);
	}
	
	
//	exam
	@RequestMapping(method = RequestMethod.POST,value="/addexam")
	public List<exam> addexam(@RequestBody exam c){
		examrepo.save(c);
		return (ArrayList<exam>)examrepo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/getexam")
	public List<exam> getexam(){
		return (ArrayList<exam>)examrepo.findAll();
	}
	
//	marks
	@RequestMapping(method = RequestMethod.POST,value="/addmarks")
	public List<marks> addmarks(@RequestBody marks c){
		marksrepo.save(c);
		return (ArrayList<marks>)marksrepo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/getmarks")
	public List<marks> getmarks(){
		return (ArrayList<marks>)marksrepo.findAll();
	}
	
}
