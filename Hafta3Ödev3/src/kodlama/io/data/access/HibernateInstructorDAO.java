package kodlama.io.data.access;

import kodlama.io.entities.Instructor;

public class HibernateInstructorDAO implements InstructorDAO {
	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added via Hibernate: " +instructor.getName());
	}
}
