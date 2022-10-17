package Week3.Homework.Ödev3.core;

public class FileLogger implements Logger {

	@Override
	public void logger(String data) {
		System.out.println("Dosyaya loglama basarılı: " + data);

	}

}
