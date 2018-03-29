package com.grupo.prisma.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.grupo.prisma.dao.CourseRepository;
import com.grupo.prisma.model.Course;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses() {

		List<Course> courses = new ArrayList<>();
		courseRepository.findAll().forEach(courses::add);
		courses = courseRepository.findAll();
		return courses;
	}

	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(String id, Course course) {
		courseRepository.save(course);

	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);

	}

}
