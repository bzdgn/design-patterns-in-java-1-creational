package creational.singleton;

public class DbSingletonTSDemo {

	public static void main(String[] args) {
		DbSingletonTS instance        = DbSingletonTS.getInstance();
		DbSingletonTS anotherInstance = DbSingletonTS.getInstance();
		
		if(instance == anotherInstance)
			System.out.println("They are the same  : " + instance + ", " + anotherInstance);
		else
			System.out.println("They are different : " + instance + ", " + anotherInstance);
	}

}
