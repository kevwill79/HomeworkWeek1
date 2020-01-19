//CondimentDecorator extends the abstract class Burger
//This allows the creation of the instance variable burger
public class Ketchup extends CondimentDecorator
{
	//The instance variable used for decorating(wrapping)
	Burger burger;
	
	public Ketchup(Burger burger)
	{
		this.burger = burger;
	}
	
	public String getIngredients()
	{
		return burger.getIngredients() + " ketchup";
	}
	
	public double cost()
	{
		return burger.cost() + 0.05;
	}
}
