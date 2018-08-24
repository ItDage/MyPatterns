package strategy;

public class Price {
	
	//聚合一个具体的策略对象
	private Strategy strategy;
	
	public Price(Strategy strategy){
		this.strategy = strategy;
	}
	/**
	 * 
	 * @Title: 计算图书的价格 
	 * @Description: TODO
	 * @param booksPrice
	 * @return
	 * @return: double
	 */
	public double quote(double booksPrice){
		
		return strategy.calcPrice(booksPrice);
	}
}
