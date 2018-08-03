package factory.compute;

public class AddOperator extends Operator{

	@Override
	public double getResult() {
		
		return super.getNum1() + super.getNum2();
	}
}
