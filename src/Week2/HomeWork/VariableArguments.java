package Week2.HomeWork;

public class VariableArguments {
	public static void main(String[] args) {
		int number = sum(7, 5);
		System.out.println(number);
		int sumMethod = sum2(2,3,4,5,6,10);
		System.out.println(sumMethod);
	}

	public static void customerAdd() {
		System.out.println("Add");
	}

	public static void customerDelete() {
		System.out.println("Delete");
	}

	public static void customerUpdate() {
		System.out.println("Update");
	}

	public static int sum(int number1,int number2) {
		return number1 + number2;
	}

	public static int sum2(int... numbers) {
		int a = 0;
		for(int i:numbers) {
			a += i;
		}
		return a;
	}
}
