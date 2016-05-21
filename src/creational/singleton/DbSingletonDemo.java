package creational.singleton;

public class DbSingletonDemo {

	public static void main(String[] args) {
		DbSingleton instance        = DbSingleton.getInstance();
		DbSingleton anotherInstance = DbSingleton.getInstance();
		
		if(instance == anotherInstance)
			System.out.println("They are the same  : " + instance + ", " + anotherInstance);
		else
			System.out.println("They are different : " + instance + ", " + anotherInstance);
	}

}
