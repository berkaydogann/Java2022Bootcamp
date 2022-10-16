package Week3.Homework.Ödev2.staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		Product product = new Product();
		product.name = "";
		product.price = 13;
		
		productManager.add(product);

	}

}
