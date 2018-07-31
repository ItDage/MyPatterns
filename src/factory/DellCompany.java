package factory;

public class DellCompany implements PCMaker{

	@Override
	public void makeMouse() {
		System.out.println("生产戴尔鼠标");
		
	}

	@Override
	public void makeLine() {
		System.out.println("生产戴尔键盘");
		
	}
}
