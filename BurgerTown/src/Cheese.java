
public class Cheese extends CondimentDecorator
{
	Burger burger;
	
	public Cheese(Burger burger)
	{
		this.burger = burger;
	}
	
	public String getIngredients()
	{
		return burger.getIngredients() + " cheese";
	}
	
	public double cost()
	{
		return burger.cost() + 0.50;
	}
}
