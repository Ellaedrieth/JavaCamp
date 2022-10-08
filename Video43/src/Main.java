public class Main {
	public static void main(String[] args) {
		ICustomerDal customerDal = new OracleCustomerDal(); //polymorphism
		CustomerManager customerManager = new CustomerManager(customerDal);
		customerManager.add();
	}

}