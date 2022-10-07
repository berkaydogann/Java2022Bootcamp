package Week3.Homework.Ödev1;

public abstract class BaseCreditManager implements ICreditManager {

	public abstract void Calculate();

	public void Save() {
		System.out.println("Kredi kaydedildi.");

	}
}
