public class StudentCreditManager extends BaseCreditManager{
	@Override
	public double hesapla(double tutar) {
		return tutar * 1.00;
	}
}
