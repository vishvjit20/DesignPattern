package SingletonPattern;

public class Singleton {
	private static Singleton inst;
	private Singleton() {
		
	}
	
	public synchronized static Singleton getTheSingleInstance() {
		if (inst == null) {
			inst = new Singleton();
		}
		return inst;
	}
}
