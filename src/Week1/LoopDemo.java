package Week1;

public class LoopDemo {

	public static void main(String[] args) {
		// for döngüsü
		for (int i = 1; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti");
		
		// while döngüsü
		int i = 1;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitti");

		// do while döngüsü
		int j = 1;
		do {
			System.out.println(j);
			j++;
		} 
		while (j < 10);
			System.out.println("Do While döngüsü bitti");

	}

}
