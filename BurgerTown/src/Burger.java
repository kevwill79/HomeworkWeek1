
public abstract class Burger 
{
	//Main ingredients include the bun and 
	//the patty type (beef, veggie, steak, turkey)
	String mainIngredients = "None";
	
	public String getIngredients() 
	{
		return mainIngredients;
	}
	
	public abstract double cost();
}
