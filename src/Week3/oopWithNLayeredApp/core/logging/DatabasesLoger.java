package Week3.oopWithNLayeredApp.core.logging;

public class DatabasesLoger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Database log eklendi: " + data);

	}

}
