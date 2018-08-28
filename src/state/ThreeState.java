package state;

public class ThreeState extends State {
	@Override
	public void handleBUG(Work work) {
		if(work.getHour() <= 6){
			System.out.println("搞不动了,太je难了....");
		}else{
			work.setNextState(new FourState());
			work.handleBUG();
		}
	}
}
