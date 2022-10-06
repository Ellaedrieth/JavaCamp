public class TeacherCreditManager implements ICreditManager {
	@Override
	public void calculate() {
		System.out.println("Öğretmene kredi hesaplandı");
	}
	@Override
	public void save() {
		System.out.println("Kaydedildi");
		
	}

}
