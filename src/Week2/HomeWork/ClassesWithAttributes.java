package Week2.HomeWork;

public class ClassesWithAttributes {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setName("Laptop");
		product.setDescription("Asus Laptop");
		product.setPrice(17.500);
		product.setStockAmount(17);
		System.out.println(product.getCode());
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
	}

}
