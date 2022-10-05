package Week3.oopWithNLayeredApp.dataAccess;

import Week3.oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao {
	public void add(Product product) {
		// Sadece ve sadece db erişim kodları yazılacak
		System.out.println("JDBC ile veritabanina eklendi");
	}

}
