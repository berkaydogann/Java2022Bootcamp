package Week3.Homework.Ödev2.polymorphismDemo;

public class FileLogger extends BaseLogger {
	public void log(String message) {
		System.out.println("Logged to file: " + message);
	}
}
