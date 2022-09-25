package Week2.HomeWork;

public class CustomerManagerMain {

	public static void main(String[] args) {
		// Reference type
		CustomerManager customerManager = new CustomerManager();
		customerManager.customerAdd();

		// Value
		int number1 = 10;
		int number2 = 20;
		number2 = number1;
		number1 = 100;
		System.out.println(number2);

		int[] numbers1 = new int[] { 1, 2, 3 };
		int[] numbers2 = new int[] { 4, 5, 6 };
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.print(numbers2[0]);
	}

}
