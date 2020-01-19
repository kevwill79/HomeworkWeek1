//CondimentDecorator extends the abstract class Burger
//This allows the creation of the instance variable burger
public class Tomatoes extends CondimentDecorator
{
	//The instance variable used for decorating(wrapping)
	Burger burger;
	
	public Tomatoes(Burger burger)
	{
		this.burger = burger;
	}
	
	public String getIngredients()
	{
		return burger.getIngredients() + " tomatoes";
	}
	
	public double cost()
	{
		return burger.cost() + 0.30;
	}
}
