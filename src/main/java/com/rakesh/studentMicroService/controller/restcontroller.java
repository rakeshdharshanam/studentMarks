package com.rakesh.studentMicroService.controller;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rakesh.studentMicroService.entity.college;
import com.rakesh.studentMicroService.entity.exam;
import com.rakesh.studentMicroService.entity.marks;
import com.rakesh.studentMicroService.entity.student;
import com.rakesh.studentMicroService.entity.studentlogin;
import com.rakesh.studentMicroService.entity.subject;
import com.rakesh.studentMicroService.entity.teacher;
import com.rakesh.studentMicroService.entity.teacherlogin;
import com.rakesh.studentMicroService.repository.collegerepo;
import com.rakesh.studentMicroService.repository.*;
import com.rakesh.studentMicroService.repository.repository;
import com.rakesh.studentMicroService.service.services;

@RestController
@CrossOrigin(origins = "*")
public class restcontroller {
	
	@Autowired
	private services s;
	
	@Autowired
	private repository studentrepo;
	
	@Autowired
	private teacherrepo teacherrepo;
	
	@Autowired
	private studentloginrepo studentloginrepo;
	
	@Autowired
	private teacherloginrepo teacherloginrepo;
	
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
		return "hello from spring boot";
	}
	
	
//	college
	@RequestMapping(method = RequestMethod.POST,value="/addcollege")
	public List<college> addCollege(@RequestBody college c){
		collegerepo.save(c);
		return (ArrayList<college>)collegerepo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/getcolleges")
	public List<college> getcollege(){
		return (ArrayList<college>)collegerepo.findAll();
	}
		
	@RequestMapping(method = RequestMethod.GET,value = "/getcollegenames")
	public List<String> getcollegenames(){
		return collegerepo.getcollegenames();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/getcollege/{collegename}")
	public college getcollege(@PathVariable String collegename){
		return collegerepo.getcollegename(collegename);
	}
	
	
//	subject
	@RequestMapping(method = RequestMethod.POST,value="/addsubject")
	public List<subject> addCourse(@RequestBody subject s){	
	subjectrepo.save(s);
	return (ArrayList<subject>) subjectrepo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/getsubject/{subjectname}")
	public subject getsubjectname(@PathVariable String subjectname){
		return  subjectrepo.getsubjectname(subjectname);
	}
	
	
	@RequestMapping(method = RequestMethod.GET,value = "/getsubjects")
	public List<subject> getcourses(){
		return (ArrayList<subject>) subjectrepo.findAll();
	}
	
	
//	teacherlogin
	
	@RequestMapping(method = RequestMethod.GET, value = "/getteacherlogins")
	public ArrayList<teacherlogin> getteacherlogins(){
		return (ArrayList<teacherlogin>)teacherloginrepo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/addteacherlogin")
	public ArrayList<teacherlogin> addteacherlogin(@RequestBody teacherlogin teacherlogin){
		teacherloginrepo.save(teacherlogin);
		return (ArrayList<teacherlogin>)teacherloginrepo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getteacherlogins/{teacherlogin}")
	public teacherlogin getteacherlogins(@PathVariable String teacherlogin){
		return teacherloginrepo.getteacherlogin(teacherlogin);
	}
	
//	teacher
	@RequestMapping("/getteachers")
	public ArrayList<teacher> getteachers(){
		return (ArrayList<teacher>)teacherrepo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getteacher/{teacherid}")
	public teacher getteacher(@PathVariable Long teacherid){
		return teacherrepo.getteacher(teacherid);
	}
		
	@RequestMapping(method = RequestMethod.POST,value = "/addteacher")
	public ArrayList<teacher> saveStudent(@RequestBody teacher te) {
		teacherrepo.save(te);
		return (ArrayList<teacher>) teacherrepo.findAll();
	}
	
//	studentlogin
	
	@RequestMapping(method = RequestMethod.GET, value = "/getstudentlogins")
	public ArrayList<studentlogin> getstudentlogins(){
		return (ArrayList<studentlogin>)studentloginrepo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/addstudentlogin")
	public ArrayList<studentlogin> addstudentlogin(@RequestBody studentlogin studentlogin){
		studentloginrepo.save(studentlogin);
		return (ArrayList<studentlogin>)studentloginrepo.findAll();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/getstudentlogins/{studentlogin}")
	public studentlogin getstudentlogins(@PathVariable String studentlogin){
		return studentloginrepo.getstudentlogin(studentlogin);
	}
	
//	student
	@RequestMapping("/getstudents")
	public ArrayList<student> getStudents(){
		return s.getStudentsService();
	}
	
	@RequestMapping("/getstudent/{studentid}")
	public student getStudents(@PathVariable Long studentid){
		return studentrepo.getstudentname(studentid);
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
	
	@RequestMapping(method = RequestMethod.GET,value = "/getexam/{examname}")
	public exam getexamname(@PathVariable String examname){
		return examrepo.getexamname(examname);
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/getexams")
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
