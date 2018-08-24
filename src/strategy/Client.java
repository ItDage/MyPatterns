package strategy;

public class Client {
	
	public static void main(String[] args) {
		// 选择并创建需要使用的策略对象
		AdvancedMemberStrategy strategy = new AdvancedMemberStrategy();
		// 创建环境
		Price price = new Price(strategy);
		// 计算价格
		System.out.println(price.quote(300));
	}
}
