//CondimentDecorator extends the abstract class Burger
//This allows the creation of the instance variable burger
public class Lettuce extends CondimentDecorator
{
	//The instance variable used for decorating(wrapping)
	Burger burger;
	
	public Lettuce(Burger burger)
	{
		this.burger = burger;
	}
	
	public String getIngredients()
	{
		return burger.getIngredients() + " lettuce";
	}
	
	public double cost()
	{
		return burger.cost() + 0.10;
	}
}
