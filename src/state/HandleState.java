package state;

public class HandleState extends State{

	@Override
	public void handleBUG(Work work) {
		
		System.out.println("当前时间" + work.getHour() + ",解决了bug下班,回家");
	}
}
