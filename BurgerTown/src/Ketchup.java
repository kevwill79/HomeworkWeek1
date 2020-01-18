
public class Ketchup extends CondimentDecorator
{
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
		return burger.cost() + 0.0;
	}
}
