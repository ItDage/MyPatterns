package proxy;

public class Persuit implements CommonInterface{
	
	private Girl girl;
	
	public Persuit(Girl girl){
		this.girl = girl;
	}

	@Override
	public void sendFlower() {
		// TODO Auto-generated method stub
		System.out.println("送给" + girl.getBj() + girl.getName() + "玫瑰花");
	}

	@Override
	public void sendCake() {
		// TODO Auto-generated method stub
		System.out.println("送给" + girl.getBj() + girl.getName() + "蛋糕");
	}

	@Override
	public void sendBook() {
		// TODO Auto-generated method stub
		System.out.println("送给" + girl.getBj() + girl.getName() + "书");
	}
	
	
	
}
