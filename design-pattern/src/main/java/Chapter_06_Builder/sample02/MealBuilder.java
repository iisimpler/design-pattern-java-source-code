package Chapter_06_Builder.sample02;

public abstract class MealBuilder
{
	protected Meal meal=new Meal();

	public abstract void buildFood();
    public abstract void buildDrink();
    public Meal getMeal()
    {
        return meal;
    }


    public Meal construct()
    {
        buildFood();
        buildDrink();
        return getMeal();
    }
}