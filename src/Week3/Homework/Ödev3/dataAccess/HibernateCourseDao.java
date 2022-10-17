package Week3.Homework.Ödev3.dataAccess;

import Week3.Homework.Ödev3.entities.Course;

public class HibernateCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile kurs loglandi: " + course.getName());

	}

}
