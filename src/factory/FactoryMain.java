package factory;

public class FactoryMain {
	
	public static void main(String[] args) {
		Factory factory = new Factory();
		DellCompany pc = factory.createPC(DellCompany.class);
		pc.makeMouse();
		pc.makeLine();
		SamsungCompany pc2 = factory.createPC(SamsungCompany.class);
		pc2.makeMouse();
		pc2.makeLine();
	}
}
