package Week3.oopWithNLayeredApp;

import Week3.oopWithNLayeredApp.business.ProductManager;
import Week3.oopWithNLayeredApp.core.logging.DatabasesLoger;
import Week3.oopWithNLayeredApp.core.logging.FileLogger;
import Week3.oopWithNLayeredApp.core.logging.Logger;
import Week3.oopWithNLayeredApp.core.logging.MailLogger;
import Week3.oopWithNLayeredApp.dataAccess.HibernateProductDao;
import Week3.oopWithNLayeredApp.dataAccess.JdbcProductDao;
import Week3.oopWithNLayeredApp.dataAccess.ProductDao;
import Week3.oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "Apple 12", 10000);

		Logger[] loggers = {new DatabasesLoger(), new MailLogger() };
		ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
		productManager.add(product1);
	}

}
