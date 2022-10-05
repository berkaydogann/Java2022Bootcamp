package Week3.oopWithNLayeredApp.core.logging;

public class MailLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Mail logu eklendi: " + data);

	}

}
