public class MySQLCustomerDal implements ICustomerDal{
	@Override
	public void add() {
		System.out.println("Müşteri MySQL'e eklendi.");
	}
}