package proxy;

public class ProxyMain {
	
	public static void main(String[] args) {
		// 初始化一个女孩
		Girl girl = new Girl();
		girl.setBj("高一六班");
		girl.setName("lxx");
		
		Proxy proxy = new Proxy(girl);
		proxy.sendFlower();
		proxy.sendCake();
		proxy.sendBook();
	}
}
