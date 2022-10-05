package Week3.oopWithNLayeredApp.business;

import java.util.Iterator;
import java.util.List;

import Week3.oopWithNLayeredApp.core.logging.Logger;
import Week3.oopWithNLayeredApp.dataAccess.HibernateProductDao;
import Week3.oopWithNLayeredApp.dataAccess.JdbcProductDao;
import Week3.oopWithNLayeredApp.dataAccess.ProductDao;
import Week3.oopWithNLayeredApp.entities.Product;

public class ProductManager {

	private ProductDao productDao;
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		if (product.getUnitPrice() < 10) {
			throw new Exception("Ürün fiyati 10 dan kücük olamaz");
		}
		productDao.add(product);

		for (Logger logger : loggers) { // Tüm loggerleri for ile döndük. [db,mail,file]
			logger.log(product.getName());
		}
	}
}
