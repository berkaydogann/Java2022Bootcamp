package Week3.Homework.Ödev3.dataAccess;

import Week3.Homework.Ödev3.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile kategori loglandi: " + category.getName());
		
	}

}
