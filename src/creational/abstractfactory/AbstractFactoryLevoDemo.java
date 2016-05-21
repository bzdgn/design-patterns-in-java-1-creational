package creational.abstractfactory;

public class AbstractFactoryLevoDemo {

	public static void main(String[] args) {
		CreditCardFactory factory = CreditCardFactory.getCreditCardFactory(100);
		
		CreditCard lowGold              = factory.getCreditCard(CardType.GOLD);
		CreditCard lowPlatinum          = factory.getCreditCard(CardType.PLATINUM);
		Validator  lowValidatorGold     = factory.getValidator(CardType.GOLD);
		Validator  lowValidatorPlatinum = factory.getValidator(CardType.PLATINUM);
		System.out.println(lowGold);
		System.out.println(lowPlatinum);
		System.out.println(lowValidatorGold);
		System.out.println(lowValidatorPlatinum);
		
		factory = CreditCardFactory.getCreditCardFactory(700);
		
		System.out.println("\n***\n");
		
		CreditCard highGold              = factory.getCreditCard(CardType.GOLD);
		CreditCard highPlatinum          = factory.getCreditCard(CardType.PLATINUM);
		Validator  highValidatorGold     = factory.getValidator(CardType.GOLD);
		Validator  highValidatorPlatinum = factory.getValidator(CardType.PLATINUM);
		System.out.println(highGold);
		System.out.println(highPlatinum);
		System.out.println(highValidatorGold);
		System.out.println(highValidatorPlatinum);
	}

}
