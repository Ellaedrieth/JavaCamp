package kodlama.io.business;
import java.util.ArrayList;

import kodlama.io.core.logging.Logger;
import kodlama.io.entities.Category;
import kodlama.io.entities.Course;

public class CategoryManager {
	private ArrayList <Category> categoryList;
	private Logger logger;
	
	public CategoryManager(ArrayList <Category> categoryList, Logger logger) {
		this.categoryList = categoryList;
		this.logger = logger;
	}
	
	public boolean isExist(Category category, ArrayList <Category> categoryList) {
		if(categoryList.contains(category)) {
			return true;
		}
		return false; 
	}
	public void add(Category category, ArrayList <Category> categoryList){
		if(isExist(category,categoryList)) {
			System.out.println("Category already exists.");
		}
		else {
			System.out.println("Category added. Name: " +category.getName());
			categoryList.add(category);
			for(Category c: categoryList) {
				logger.log(c.getName());
			}
			
		}
	}
	
	public void delete(Category category, ArrayList <Category> categoryList){
		if(!isExist(category,categoryList)) {
			System.out.println("Category doesn't exist.");
		}
		else {
			System.out.println("Category deleted. Name: " +category.getName());
			categoryList.remove(category);
		}
	}
	
	public void addCourseToCategory(Course course, Category category) {
		System.out.println("Course " +course.getName()+ "is added to category " +category.getName());
	} //sembolik method. kategori ve kursları maalesef birbirine bağlamanın bir yolunu bulamadım.
}
