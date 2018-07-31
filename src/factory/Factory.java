package factory;

public class Factory extends AbsFactory{

	@Override
	public <T extends PCMaker> T createPC(Class<T> tClass) {
		PCMaker pcmaker = null;
		
		try {
			pcmaker = (T) Class.forName(tClass.getName()).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return (T)pcmaker;
	}
}
