package decorate;

public class DecoratorTShirt extends Decorator{

	public DecoratorTShirt(People people) {
		super(people);
	}
	
	@Override
	public void wear(){
		System.out.println("穿个T-shirt");
	}
}
