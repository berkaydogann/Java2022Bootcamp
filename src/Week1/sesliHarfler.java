package Week1;

public class sesliHarfler {

	public static void main(String[] args) {
		char harf = 'i';

		switch (harf) {
		case 'A', 'I', 'O', 'U':
			System.out.println("Kalın - Büyük sesli harf");
			break;
		case 'a', 'ı', 'o', 'u':
			System.out.println("Kalın - Küçük sesli harf");
			break;
		case 'E', 'İ', 'Ö', 'Ü':
			System.out.println("İnce - Büyük sesli harf");
			break;
		case 'e', 'i', 'ö', 'ü':
			System.out.println("İnce - Küçük sesli harf");
			break;
		default:
			System.out.println("Girilen harf sessiz harftir...");
		}

	}

}
