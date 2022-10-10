package kodlama.io.business;
import java.util.ArrayList;
import kodlama.io.core.logging.Logger;
import kodlama.io.entities.Instructor;

public class InstructorManager {
	private Instructor instructor;
	private ArrayList <Instructor> instructorList;
	private Logger logger;
	
	public InstructorManager(ArrayList <Instructor> instructorList, Logger logger) {
		this.instructorList = instructorList;
		this.logger = logger;
	}
	
	public boolean isExist(Instructor instructor, ArrayList <Instructor> instructorList) {
		if(instructorList.contains(instructor)) {
			return true;
		}
		return false; 
	}
	
	public void add(Instructor instructor, ArrayList <Instructor> instructorList ) {
		if(isExist(instructor, instructorList)) {
			System.out.println("Course already exists.");
		}
		else {
			System.out.println("Instructor added! Name: " +instructor.getName());
			instructorList.add(instructor);
			for(Instructor i: instructorList) {
				logger.log(i.getName());
			}
		}
	}
	public void delete(Instructor instructor, ArrayList <Instructor> instructorList) {
		if(isExist(instructor, instructorList)) {
			System.out.println("Instructor deleted.");
			instructorList.remove(instructor);
		}
		else {
			System.out.println("Instructor doesn't exists.");
		}
	}
}
