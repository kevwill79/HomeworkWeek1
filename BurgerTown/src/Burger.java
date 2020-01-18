
public abstract class Burger 
{
	String mainIngredients = "None";
	
	public String getIngredients() 
	{
		return mainIngredients;
	}
	
	public abstract double cost();
}
