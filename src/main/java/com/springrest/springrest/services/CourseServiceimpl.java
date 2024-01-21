package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceimpl implements CourseService {

	List<Course> list;
	public CourseServiceimpl()
	{
		list = new ArrayList<Course>();
		list.add(new Course(145 , "Java Course","This is basic conttaints for java"));
		list.add(new Course(2828,"Spring boot course","Create spring boot applications"));		
	}
	
	
	@Override
	public List<Course> getCorses() {
		
		return list;
	}


	@Override
	public Course getCourse(long courseId) {
		Course c = null;
		for (Course course:list)
		{
		if(course.getId() == courseId)	
		{
			c = course;
			break;
		}
		}
		return c;
	}


	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

}
