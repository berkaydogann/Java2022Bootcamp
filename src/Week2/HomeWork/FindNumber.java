package Week2.HomeWork;

public class FindNumber {

	public static void main(String[] args) {
		int[] number = new int[] { 1, 2, 5, 7, 9, 0 };
		int search = 5;
		boolean isExist = false;
		for (int i : number) {
			if (search == number[i]) {
				isExist = true;
				System.out.println(isExist);
				break;
			}

		}
		if (isExist) {
			System.out.println("Number is available");
		} else {
			System.out.println("Number is not available");
		}

	}

}
