package kodlama.io.data.access;

import kodlama.io.entities.Category;

public class CategoryJDBCDAO implements CategoryDAO{
	@Override
	public void add(Category category) {
		System.out.println("Category added via JDBC: " +category.getName());
		
	}

}
