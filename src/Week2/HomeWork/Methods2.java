package Week2.HomeWork;

public class Methods2 {

	public static void main(String[] args) {
		int number = sum(7,5);
		System.out.println(number);
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

}
