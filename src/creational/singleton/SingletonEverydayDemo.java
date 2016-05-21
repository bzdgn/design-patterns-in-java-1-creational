package creational.singleton;

public class SingletonEverydayDemo {

	public static void main(String[] args) {
		
		Runtime singletonRuntime = Runtime.getRuntime();
		System.out.println(singletonRuntime);
		
		Runtime anotherInstance = Runtime.getRuntime();
		System.out.println(anotherInstance);
		
		if(singletonRuntime == anotherInstance)
			System.out.println("They are the same");
		else
			System.out.println("They are different");
		
	}

}
