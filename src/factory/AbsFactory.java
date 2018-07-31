package factory;

public abstract class AbsFactory {
	
	public abstract <T extends PCMaker> T createPC(Class<T> tClass);
}
