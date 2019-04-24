package Builder;

//Separate the construction of a complex object from its representation, allowing the same construction process to
//create various representations.

public class BuilderPatternDemo {
	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("\nVegetarian Meal");
		vegMeal.showItems();
		System.out.println("Total cost" + vegMeal.getCost());
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("\nNon Vegetarian Meal");
		vegMeal.showItems();
		System.out.println("Total cost" + nonVegMeal.getCost());
	}
}
