public class CustomerManager {
	private ICustomerDal dal;
	public CustomerManager(ICustomerDal dal) {
		this.dal = dal;
	}
	public void add(){
		dal.add();
	}
}
