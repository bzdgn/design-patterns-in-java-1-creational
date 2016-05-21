package creational.singleton;

public class DbSingletonTS {
	
	private static DbSingletonTS instance = null;	// Lazy Loading
	
	private DbSingletonTS() { }
	
	public static DbSingletonTS getInstance() {
		if(instance == null) {
			synchronized(DbSingletonTS.class) {
				if(instance == null) {
					instance = new DbSingletonTS();	// Lazy Loading
				}
			}
		}
		
		return instance;
	}

}
