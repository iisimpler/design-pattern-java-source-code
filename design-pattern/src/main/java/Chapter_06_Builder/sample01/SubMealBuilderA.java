package Chapter_06_Builder.sample01;

public class SubMealBuilderA extends MealBuilder
{
	@Override
	public void buildFood()
	{
		meal.setFood("һ�����ȱ�");
	}
	@Override
	public void buildDrink()
	{
	    meal.setDrink("һ������");
	}
}