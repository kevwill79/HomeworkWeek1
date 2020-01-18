
public class Mayonnaise extends CondimentDecorator
{
	Burger burger;
	
	public Mayonnaise(Burger burger)
	{
		this.burger = burger;
	}
	
	public String getIngredients()
	{
		return burger.getIngredients() + " Mayonnaise";
	}
	
	public double cost()
	{
		return burger.cost() + 0.05;
	}
}
