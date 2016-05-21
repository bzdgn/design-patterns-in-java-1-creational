package creational.builder;

public class LunchOrderBuilderDemo {

	public static void main(String[] args) {
		
		LunchOrder.Builder builder = new LunchOrder.Builder();
		
		//builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");
				
		//LunchOrder lunchOrder = builder.build();
		
		LunchOrder lunchOrder = builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey").build();
		
		System.out.println(lunchOrder.getBread());
		System.out.println(lunchOrder.getCondiments());
		System.out.println(lunchOrder.getDressing());
		System.out.println(lunchOrder.getMeat());
		
		System.out.println(lunchOrder.hashCode());
		
		lunchOrder = builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Lamb").build();
		
		System.out.println(lunchOrder.hashCode());
	}

}
