package Week3.Homework.Ödev2.polymorphismDemo;

public class CustomerManager {
	private BaseLogger Logger;

	public CustomerManager(BaseLogger logger) {
		this.Logger = logger;
	}

	public void add() {
		System.out.println("Müsteri eklendi...");
		this.Logger.log("Başarılı");
	}
}
