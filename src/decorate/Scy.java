package decorate;

public class Scy implements People{

	@Override
	public void wear() {
		 System.out.println("今天该穿什么呢?");
	}
	
	public static void main(String[] args) {
		People people = new DecoratorSuit(new DecoratorShirt(new Scy()));
		people.wear();
	}
}
