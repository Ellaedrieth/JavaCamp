public class Main {
	public static void main(String[] args) {
		BaseCreditManager[] baseManager = new BaseCreditManager[]	 
				{new TarımCreditManager(), new TeacherCreditManager(), new StudentCreditManager()};
		for(BaseCreditManager bcm : baseManager) {
			System.out.println(bcm.hesapla(1000));
		}
		
	}
	
	

}
