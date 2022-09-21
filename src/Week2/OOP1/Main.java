package Week2.OOP1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		String message = "Vade Orani";

		Product product1 = new Product();
		// Set Value
		product1.setName("Delonghi Kahve Makinesi");
		product1.setUnitPrice(7200);
		product1.setDiscount(6);
		product1.setUnitInStock(3);
		product1.setImageUrl("delonghi.png");

		Product product2 = new Product();
		product2.setName("Philips Kahve Makinesi");
		product2.setUnitPrice(6000);
		product2.setDiscount(2);
		product2.setUnitInStock(5);
		product2.setImageUrl("philips.jpg");

		// Birden fazla nesne var ise bu tarz islem yapılmaktadır.
		Product[] products = { product1, product2 };
		System.out.println("<ul>");
		for (Product oop1Product : products) {
			System.out.println("<li>" + "Product Name: " + oop1Product.getName() + "</li>");
		}
		System.out.println("</ul>");

		// Get Value
		System.out.println("Product1 Name: " + product1.getName());
		System.out.println("Product1 Unitprice: " + product1.getUnitPrice());
		System.out.println("Product1 discount: " + product1.getDiscount());
		System.out.println("Product1 unitInStock: " + product1.getUnitInStock());
		System.out.println("Product1 imageUrl: " + product1.getImageUrl() + "\n");

		System.out.println("Product2 Name: " + product2.getName());
		System.out.println("Product2 Unitprice: " + product2.getUnitPrice());
		System.out.println("Product2 discount: " + product2.getDiscount());
		System.out.println("Product2 unitInStock: " + product2.getUnitInStock());
		System.out.println("Product2 imageUrl: " + product2.getImageUrl() + "\n");

		IndividualCustomer IndividualCustomer = new IndividualCustomer();
		IndividualCustomer.setId(1);
		IndividualCustomer.setCustomerNumber("11356846846");
		IndividualCustomer.setPhoneNumber("05307412369");
		IndividualCustomer.setFirstName("Berkay");
		IndividualCustomer.setLastName("Aydogan");

		CorporateCustomer CorporateCustomer = new CorporateCustomer();
		CorporateCustomer.setId(2);
		CorporateCustomer.setCustomerNumber("18343");
		CorporateCustomer.setPhoneNumber("3127895413");
		CorporateCustomer.setCompanyName("Kodlama");
		CorporateCustomer.setTaxNumber("998746315");
		
		
		Customer[] customers = {IndividualCustomer, CorporateCustomer};
		
	}

}
