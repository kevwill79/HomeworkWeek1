
public class BurgerTownMenu 
{
	public static void main(String[] args)
	{
		//Turkey burger
		Burger turkeyBurger = new TurkeyBurger();
		turkeyBurger = new Lettuce(turkeyBurger);
		turkeyBurger = new Tomatoes(turkeyBurger);
		turkeyBurger = new Mayonnaise(turkeyBurger);
		turkeyBurger = new Bacon(turkeyBurger);
		
		System.out.println(turkeyBurger.getIngredients() 
				+ "  COST: $" + turkeyBurger.cost());
		
		//Regular hamburger
		Burger hamburger = new Hamburger();
		hamburger = new Lettuce(hamburger);
		hamburger = new Onions(hamburger);
		hamburger = new Cheese(hamburger);
		hamburger = new Tomatoes(hamburger);
		hamburger = new Ketchup(hamburger);
		hamburger = new Mayonnaise(hamburger);
		hamburger = new Pickles(hamburger);
		hamburger = new Bacon(hamburger);
		
		System.out.println(hamburger.getIngredients()
				+ "  COST: $" + hamburger.cost());
		
		//Steak burger
		Burger steakBurger = new SteakBurger();
		steakBurger = new Tomatoes(steakBurger);
		steakBurger = new Lettuce(steakBurger);
		
		System.out.println(steakBurger.getIngredients()
				+ "  COST: $" + steakBurger.cost());
		
		//Veggie burger
		Burger veggieBurger = new VeggieBurger();
		
		System.out.println(veggieBurger.getIngredients() 
				+ "  COST: $" + veggieBurger.cost());
	}
}
