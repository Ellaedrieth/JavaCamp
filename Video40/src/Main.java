public class Main {
	public static void main(String[] args) {
		WomenGameCalculator womenGameCalculator = new WomenGameCalculator();
		
		
		GameCalculator [] gameCalculators = new GameCalculator[]
				{new MenGameCalculator(), new WomenGameCalculator(), new ChildrenGameCalculator()};
				//daha sonra istersek ekleyebiliriz. ex: OlderGameCalculator
	}
}
