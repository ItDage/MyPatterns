package state;

public class Work {
	
	private State state;
	
	private int hour;
	
	private boolean finish;

	public Work(){
		state = new OneState();
	}
	
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public boolean isFinish() {
		return finish;
	}

	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	
	public void setNextState(State state){
		this.state = state;
	}
	
	public void handleBUG(){
		state.handleBUG(this);
	}
	
}
