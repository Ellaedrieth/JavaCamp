package kodlama.io.business;
import java.util.ArrayList;

import kodlama.io.core.logging.Logger;
import kodlama.io.entities.Course;

public class CourseManager {
	private ArrayList <Course> courseArrayList;
	private Logger logger;
	
	public CourseManager(ArrayList <Course> courseArrayList, Logger logger) {
		this.courseArrayList = courseArrayList; 
		this.logger = logger;
	}
	
	public boolean isExist(Course course, ArrayList <Course> courseArrayList) {
		if(courseArrayList.contains(course)) {
			return true;
		}
		return false;  
	}
	
	public void add(Course course, ArrayList <Course> courseArrayList ) {
		if(isExist(course,courseArrayList)) {
			System.out.println("Course already exists.");
		}
		else {
			System.out.println("Course added! Name: " +course.getName());
			courseArrayList.add(course);
			for(Course c: courseArrayList) {
				logger.log(c.getName());
			}
		}
	} 
	
	public void delete(Course course, ArrayList <Course> courseArrayList) {
		if(isExist(course,courseArrayList)) {
			System.out.println("Course deleted.");
			courseArrayList.remove(course);
		}
		else {
			System.out.println("Course doesn't exists.");
		}
	}
}
