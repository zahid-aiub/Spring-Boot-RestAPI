package com.example.StartSB.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.StartSB.model.Student;

@org.springframework.stereotype.Service
public class Service {
	
	private List<Student> students = new ArrayList<>(Arrays.asList(
			
			new Student("a", "Zahid", "CSSE"),
			new Student("b", "Noman", "I"),
			new Student("c", "Sadiya", "SE"),
			new Student("d", "Shreya", "ME")
			
			));
	
	public Object getAllStudent(){
	
		return students;
	}
	
	public Student getStudent(String id) {
		return students.stream().filter(t-> t.getId().equals(id)).findFirst().get();
	}

	public void addStudentData(Student st) {
		students.add(st);
		
	}

	public void updateStudentData(Student st, String id) {
		for(int i = 0; i<students.size(); i++) {
			Student s = students.get(i);
			if (s.getId().equals(id)) {
				students.set(i, st);
				
			}
		}
		
	}

	public void deleteStudentData(String id) {
		students.removeIf(t-> t.getId().equals(id));
		
	}


}
