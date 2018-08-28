package state;

public class OneState extends State{

	@Override
	public void handleBUG(Work work) {
		if(work.getHour() <= 2){
			System.out.println("不到两个小时就解决了该bug, so easy");
		}else{
			work.setNextState(new TwoState());
			work.handleBUG();
		}
		
	}
}
