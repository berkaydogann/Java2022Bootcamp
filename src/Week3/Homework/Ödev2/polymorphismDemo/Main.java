package Week3.Homework.Ödev2.polymorphismDemo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		/*
		 * EmailLogger emailLogger = new EmailLogger(); emailLogger.Log("Log eklendi.");
		 * DatabaseLogger databaseLogger = new DatabaseLogger();
		 * databaseLogger.Log("Log");
		 * 
		 * BaseLogger[] loggers = new BaseLogger[] { new ConsoleLogger(), new
		 * FileLogger(), new DatabaseLogger(), new EmailLogger() }; for (BaseLogger
		 * baseLogger : loggers) { baseLogger.Log("Başarılı"); }
		 */

		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();

	}

}
