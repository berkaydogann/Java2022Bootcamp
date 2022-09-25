package Week2.HomeWork;

public class reCapDemo_Classes {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int sumResult = calculator.Sum(1, 5);
		System.out.println(sumResult);
		int extractionResult = calculator.Extraction(1, 5);
		System.out.println(extractionResult);
		int hitResult = calculator.Hit(1, 5);
		System.out.println(hitResult);
		int divisionResult = calculator.Division(1, 5);
		System.out.println(divisionResult);
	}

}
