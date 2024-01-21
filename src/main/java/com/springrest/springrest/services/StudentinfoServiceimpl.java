package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Student_details;
@Service
public class StudentinfoServiceimpl implements StudentinfoService {

	
	List<Student_details> list ;

	public StudentinfoServiceimpl() {
		list = new ArrayList<Student_details>();
		list.add(new Student_details(1,"Khushi"));
		list.add(new Student_details(2,"Raj"));
		
	}
	@Override
	public List<Student_details> get_AllStudents() {

		return list;
	}

	

	
}
