package strategy;

public class PrimaryMemberStrategy implements Strategy {
	@Override
	public double calcPrice(double booksPrice) {
		System.out.println("初级会员不打折");
		return booksPrice;
	}
}
