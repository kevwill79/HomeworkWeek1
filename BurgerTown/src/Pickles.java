
public class Pickles extends CondimentDecorator
{
	Burger burger;
	
	public Pickles(Burger burger)
	{
		this.burger = burger;
	}
	
	public String getIngredients()
	{
		return burger.getIngredients() + " pickles";
	}
	
	public double cost()
	{
		return burger.cost() + 0.20;
	}
}
