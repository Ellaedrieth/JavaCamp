public class Main {
	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.name = "Mouse";
		product.price = 100;
		manager.add(product);
		
		
		DatabaseHelper.Crud.delete();
	}
}
