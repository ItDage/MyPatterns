package strategy;

public class AdvancedMemberStrategy implements Strategy {
	@Override
	public double calcPrice(double booksPrice) {
		// 高级会员打八折
		return booksPrice * 0.8;
	}
}
