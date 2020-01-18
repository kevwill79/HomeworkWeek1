
public class Lettuce extends CondimentDecorator
{
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
		return burger.cost() + 0.0;
	}
}
