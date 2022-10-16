package Week3.Homework.Ödev2.abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();

	public final void gameOver() {
		System.out.println("Oyun bitti!!");
	}
}
