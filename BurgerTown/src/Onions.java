
public class Onions extends CondimentDecorator
{
	Burger burger;
	
	public Onions(Burger burger)
	{
		this.burger = burger;
	}
	
	public String getIngredients()
	{
		return burger.getIngredients() + " onions";
	}
	
	public double cost()
	{
		return burger.cost() + 0.10;
	}
}
