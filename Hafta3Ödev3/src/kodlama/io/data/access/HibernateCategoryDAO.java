package kodlama.io.data.access;
import kodlama.io.entities.Category;
public class HibernateCategoryDAO implements CategoryDAO{
	public void add(Category category) {
		System.out.println("Category added via Hibernate. " +category.getName());
	}
}
