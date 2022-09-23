public class Main {
	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(10); 
		product.setDescription("Asus Laptop"); 
		product.setPrice(5000);
		product.setStockAmount(5);
		System.out.println(product.getName());
		ProductManager productManager = new ProductManager();	
		productManager.add(product);
		productManager.add2(1, "x", "asd", 2, 200);
	}
}