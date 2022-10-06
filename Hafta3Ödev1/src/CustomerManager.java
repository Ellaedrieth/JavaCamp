public class CustomerManager {
	private Customer customer;
	private ICreditManager creditManager;
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		this.customer = customer;
		this.creditManager = creditManager;
	}
	public void save() {
		System.out.println("Müşteri kaydedildi: " + customer.getId());
	}
	public void delete() {
		System.out.println("Müşteri silindi: " + customer.getId());
	}
	public void giveCredit() {
		this.creditManager.calculate();
	}
}
