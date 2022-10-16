package Week3.Homework.Ödev2.abstractClasses;

public class Main {

	public static void main(String[] args) {
		GameCalculator[] gameCalculator = new GameCalculator[] { new WomanGameCalculator(), new ManGameCalculator() };
		for (GameCalculator calculator : gameCalculator) {
			calculator.hesapla();
			calculator.gameOver();
		}

	}

}
