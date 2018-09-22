package proxy;

public class Proxy implements CommonInterface {
	
	private Persuit persuit;
	
	public Proxy(Girl girl){
		persuit = new Persuit(girl);
		System.out.println("我代理的是zz帅哥");
	}
	
	@Override
	public void sendFlower() {
		persuit.sendFlower();
	}
	@Override
	public void sendCake() {
		persuit.sendCake();
	}
	@Override
	public void sendBook() {
		persuit.sendBook();
	}
}
