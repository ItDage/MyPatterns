package state;

public class StateMain {
	
	public static void main(String[] args) {
		Work work = new Work();
		work.setHour(2);
		work.handleBUG();
		work.setHour(4);
		work.handleBUG();
		work.setHour(6);
		work.handleBUG();
		work.setFinish(true);
//		work.setFinish(false);
		work.setHour(8);
		work.handleBUG();
		work.setHour(10);
		work.handleBUG();
	}
}
