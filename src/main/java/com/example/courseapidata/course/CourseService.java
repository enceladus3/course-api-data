package com.example.courseapidata.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;

	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		for (Course course : courseRepository.findByTopicId(topicId)) {
			courses.add(course);
		}
		return courses;
	}

	public Course getCourse(String id) {
		return courseRepository.findById(id).orElse(null);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);

	}

	public void updateCourse(Course course) {
		courseRepository.save(course);

	}

	public void deleteCourse(String id) {
		courseRepository.deleteById(id);
	}

}
