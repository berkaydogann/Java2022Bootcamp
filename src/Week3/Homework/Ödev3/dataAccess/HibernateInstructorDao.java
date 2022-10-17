package Week3.Homework.Ödev3.dataAccess;

import Week3.Homework.Ödev3.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile egitmen loglandi: " + instructor.getFirstName());

	}

}
