package kodlama.io.data.access;
import kodlama.io.entities.Course;

public class JDBCCourseDAO implements CourseDAO{
	@Override
	public void add(Course course) {
		System.out.println("Course added with JDBC. " +course.getName());
		
	}
}
