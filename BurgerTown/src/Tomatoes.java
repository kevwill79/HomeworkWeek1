
public class Tomatoes extends CondimentDecorator
{
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
		return burger.cost() + 0.0;
	}
}
