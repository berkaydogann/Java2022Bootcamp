package Week3.Homework.Ödev3;

import java.util.ArrayList;
import java.util.List;

import Week3.Homework.Ödev3.business.CategoryManager;
import Week3.Homework.Ödev3.business.CourseManager;
import Week3.Homework.Ödev3.business.InstructorManager;
import Week3.Homework.Ödev3.core.DatabaseLogger;
import Week3.Homework.Ödev3.core.FileLogger;
import Week3.Homework.Ödev3.core.Logger;
import Week3.Homework.Ödev3.dataAccess.HibernateCategoryDao;
import Week3.Homework.Ödev3.dataAccess.HibernateCourseDao;
import Week3.Homework.Ödev3.dataAccess.HibernateInstructorDao;
import Week3.Homework.Ödev3.dataAccess.JdbcCategoryDao;
import Week3.Homework.Ödev3.entities.Category;
import Week3.Homework.Ödev3.entities.Course;
import Week3.Homework.Ödev3.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = {new FileLogger(), new DatabaseLogger()};

		Course course1 = new Course(1, "C# ", "Backend", 60);

		CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);

		Category category1 = new Category(1, "Backend2");
		CategoryManager categoryManager1 = new CategoryManager(new HibernateCategoryDao(), loggers);
		categoryManager1.add(category1);

		Instructor instructor1 = new Instructor(1, "Engin", "Demirög");
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		instructorManager.add(instructor1);
	}

}
