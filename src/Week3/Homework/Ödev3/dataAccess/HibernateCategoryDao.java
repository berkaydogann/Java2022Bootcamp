package Week3.Homework.Ödev3.dataAccess;

import Week3.Homework.Ödev3.entities.Category;

public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Hibernate ile kategori loglandi: " + category.getName());
		
	}

}
