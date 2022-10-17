package Week3.Homework.Ödev3.dataAccess;

import Week3.Homework.Ödev3.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("JDBC ile kurs loglandi: " + course.getName());
		
	}

}
