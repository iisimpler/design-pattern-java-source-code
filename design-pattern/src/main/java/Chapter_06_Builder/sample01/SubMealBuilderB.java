package Chapter_06_Builder.sample01;

public class SubMealBuilderB extends MealBuilder
{
	@Override
	public void buildFood()
	{
		meal.setFood("һ�������");
	}
	@Override
	public void buildDrink()
	{
		 meal.setDrink("һ����֭");
	}
}