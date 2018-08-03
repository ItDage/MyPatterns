package factory.compute;

public class SimpleFactory {
	
	public static Operator createObject(String op){
		Operator oprator = null;
		switch (op){
			case "+":
				oprator = new AddOperator();
				break;
			case "-":
				oprator = new SubductionOperator();
				break;
		}
		return oprator;
	}
}
