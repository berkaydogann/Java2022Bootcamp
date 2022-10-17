package Week3.Homework.Ödev3.business;

import java.util.List;

import Week3.Homework.Ödev3.core.Logger;
import Week3.Homework.Ödev3.dataAccess.CategoryDao;
import Week3.Homework.Ödev3.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {

		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		Category[] categorys = { new Category(1, "Backend"), new Category(2, "Frontend") };
		for (Category category2 : categorys) {
			if (category.getName() == category2.getName()) {
				throw new Exception(category.getName() + " isimli kurs kategorisi sistemde mevcuttur. Kurs ismi tekrar edemez");
			}
		}
		categoryDao.add(category);
		for (Logger logger : loggers) {
			logger.logger(category.getName() + " kurs eklendi.");
		}
	}

}
