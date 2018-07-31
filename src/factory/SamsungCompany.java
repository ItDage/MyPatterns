package factory;

public class SamsungCompany implements PCMaker{

	@Override
	public void makeMouse() {
		System.out.println("生产三星鼠标");
		
	}

	@Override
	public void makeLine() {
		System.out.println("生产三星键盘");
		
	}
}
