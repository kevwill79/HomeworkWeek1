
public class Mustard extends CondimentDecorator
{
	Burger burger;
	
	public Mustard(Burger burger)
	{
		this.burger = burger;
	}
	
	public String getIngredients()
	{
		return burger.getIngredients() + " Mustard";
	}
	
	public double cost()
	{
		return burger.cost() + 0.05;
	}
}
