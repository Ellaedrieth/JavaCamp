package kodlama.io.data.access;

import kodlama.io.entities.Instructor;

public class JDBCInstructorDAO implements InstructorDAO {
	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added via JDBC: " +instructor.getName());
	}
}
