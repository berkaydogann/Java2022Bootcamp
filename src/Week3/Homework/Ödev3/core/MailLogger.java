package Week3.Homework.Ödev3.core;

public class MailLogger implements Logger {

	@Override
	public void logger(String data) {
		System.out.println("Mail ile loglama basarili: " + data);

	}

}
