package Chapter_06_Builder.sample01;

public class SubMealBuilderB extends MealBuilder
{
	@Override
	public void buildFood()
	{
		meal.setFood("一个鸡肉卷");
	}
	@Override
	public void buildDrink()
	{
		 meal.setDrink("一杯果汁");
	}
}