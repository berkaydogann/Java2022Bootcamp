package Week3.oopWithNLayeredApp.dataAccess;

import Week3.oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{

	public void add(Product product) {
		// Sadece ve sadece db erişim kodları yazılacak
		System.out.println("Hibernate ile veritabanina eklendi");
	}
}
