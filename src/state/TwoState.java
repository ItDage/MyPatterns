package state;

public class TwoState extends State {
	@Override
	public void handleBUG(Work work) {
		if (work.getHour() <= 4) {
			System.out.println("这个bug有点难...");
		} else {
			work.setNextState(new ThreeState());
			work.handleBUG();
		}
	}
}
