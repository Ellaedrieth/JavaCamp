public class ProductValidator {
	static {
		System.out.println("Static yapıcı bloğu çalıştı.");
	}
	public ProductValidator() {
		System.out.println("Blok çalıştı.");
	}
	public static boolean isValid(Product product) {
		if(product.price > 0 && !product.name.isEmpty()) {
			return true;
		}
		return false;
	}  
	public void bisey() { //bunu çağırmak için newlemek şart
		
	}
}

