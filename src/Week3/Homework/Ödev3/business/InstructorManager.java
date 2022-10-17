package Week3.Homework.Ödev3.business;

import java.util.List;

import Week3.Homework.Ödev3.core.Logger;
import Week3.Homework.Ödev3.dataAccess.InstructorDao;
import Week3.Homework.Ödev3.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;

	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {

		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}

	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.logger("Egitmen loglandi");
		}
	}

}
