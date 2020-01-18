
public class Bacon extends CondimentDecorator
{
	Burger burger;
	
	public Bacon(Burger burger)
	{
		this.burger = burger;
	}
	
	public String getIngredients()
	{
		return burger.getIngredients() + " Bacon";
	}
	
	public double cost()
	{
		return burger.cost() + 0.99;
	}
}
