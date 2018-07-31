package creater;

public class Singleton {
	
	private Singleton(){};
	
	private static class SingletonBuild{
		private static Singleton singleton = new Singleton();
	}
	
	private static Singleton getSingleton(){
		return SingletonBuild.singleton;
	}
	
	public static void main(String[] args) {
		System.out.println(Singleton.getSingleton());
	}
}
