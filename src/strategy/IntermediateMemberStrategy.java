package strategy;

public class IntermediateMemberStrategy implements Strategy {
	@Override
	public double calcPrice(double booksPrice) {
		// 中级会员打9折
		return booksPrice * 0.9;
	}
}
