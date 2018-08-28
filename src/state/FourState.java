package state;

public class FourState extends State {
	@Override
	public void handleBUG(Work work) {
		if(work.isFinish()){
			work.setNextState(new HandleState());
			work.handleBUG();
		}else{
			if(work.getHour() <= 8){
				System.out.println("头晕眼花");
			}else{
				System.out.println("不搞了,回家吃饭");
			}
		}
	}
}
