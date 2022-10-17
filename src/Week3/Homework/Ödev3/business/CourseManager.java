package Week3.Homework.Ödev3.business;

import java.util.List;

import Week3.Homework.Ödev3.core.Logger;
import Week3.Homework.Ödev3.dataAccess.CourseDao;
import Week3.Homework.Ödev3.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;

	public CourseManager(CourseDao courseDao, Logger[] loggers) {

		this.courseDao = courseDao;
		this.loggers = loggers;
	}

	public void add(Course course) throws Exception {
		Course[] courses = { new Course(1, "C# Anguler", "Backend programing", 120),
				new Course(2, "Java+React", "Frontend programing", 12) };
		for (Course course2 : courses) {
			if (course.getName() == course2.getName()) {
				throw new Exception(course.getName() + " kurs sistemde kayitlidir. Kurs ismi tekrar edemez");
			}
			if (course.getPrice() < 0) {
				throw new Exception("Kurs fiyatı 0'dan kücük olamaz!");
			}
		}
		courseDao.add(course);
		for (Logger logger : loggers) {
			logger.logger("Kurs loglandi");
		}

	}

}
