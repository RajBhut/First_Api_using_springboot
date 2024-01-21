package com.springrest.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.entities.Student_details;
import com.springrest.springrest.services.CourseService;
import com.springrest.springrest.services.CourseServiceimpl;
import com.springrest.springrest.services.StudentinfoService;

//reprasantatial  state tranfer = "REST".


@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	@Autowired
	private StudentinfoService studentinfoservisce;
	
@GetMapping("/home")
	public String home()
	{
		return "Hellow Khushi :) <3";
		
	}
@RequestMapping(path = "/courses",method = RequestMethod.GET)//alternative of @getmapping
public List<Course> getCourses()
{
	 return this.courseService.getCorses();

}
@GetMapping("/courses/{courseId}")
public Course getCourse(@PathVariable String courseId)
{
	return this.courseService.getCourse(Long.parseLong(courseId));
}
@PostMapping("/courses")
public Course addCourse(@RequestBody Course course)
{
	return this.courseService.addCourse(course);
}
@GetMapping("/students")
public List<Student_details> getallDetails()
{
	return this.studentinfoservisce.get_AllStudents();
}

}
