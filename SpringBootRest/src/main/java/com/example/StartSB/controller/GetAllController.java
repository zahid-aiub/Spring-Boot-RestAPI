package com.example.StartSB.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletInputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.StartSB.model.Student;
import com.example.StartSB.service.Service;

@RestController
public class GetAllController {
	
	@Autowired
	private Service sv;
	
	@RequestMapping("/getStudents")
	public Object gelAll() {
		
		return sv.getAllStudent();
	}
	
	@RequestMapping("/getStudents/{id}")
	public Student getSpecificStudent(@PathVariable String id) {
		
		return sv.getStudent(id);
	}
	
	
	@RequestMapping(method=RequestMethod.POST, value="/addStudent")
	public void addStudent(@RequestBody Student st) {
		sv.addStudentData(st);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/updateStudent/{id}")
	public void updateStudent(@RequestBody Student st, @PathVariable String id) {
		sv.updateStudentData(st,id);
	}
	
	@RequestMapping("/deleteStudent/{id}")
	public void deleteStudent(@PathVariable String id) {
		sv.deleteStudentData(id);
	}
	
}
