package Week3.Homework.Ödev3.core;

public class DatabaseLogger implements Logger {

	@Override
	public void logger(String data) {
		System.out.println("Veritabanına loglama basarili: " + data);

	}

}
