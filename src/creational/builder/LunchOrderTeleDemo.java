package creational.builder;

public class LunchOrderTeleDemo {
	
	public static void main(String args[]) {
		
		LunchOrderTele lunchOrderBean = new LunchOrderTele("Wheat", "Lettuce", "Mustard", "Ham");
		
//		lunchOrderBean.setBread("Wheat");
//		lunchOrderBean.setCondiments("Lettuce");
//		lunchOrderBean.setDressing("Mustard");
//		lunchOrderBean.setMeat("Ham");
		
		System.out.println(lunchOrderBean.getBread());
		System.out.println(lunchOrderBean.getCondiments());
		System.out.println(lunchOrderBean.getDressing());
		System.out.println(lunchOrderBean.getMeat());
	}

}
