package main.java.recipes;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class AddRecipe {

	public static List<Meal> meals = new ArrayList<Meal>();
	private static Scanner s;

	public static List<Meal> add() throws FileNotFoundException {
		File plik = new File("przepisy.txt");
		s = new Scanner(plik);
		s.useDelimiter(";");
		while (s.hasNextLine()) {
			String typ = s.next();
			if (!typ.equals("Deser") && !typ.equals("Zupa") && !typ.equals("DanieGlowne")) {
				System.out.println("Nie rozpoznaje tego");
				break;
			}
			String name = s.next();
			int preparationTime = s.nextInt();
			int numberOfPeople = s.nextInt();
			String difficulty = s.next();
			String[] ingredients = s.next().split("/");
			String preparation = s.next();

			if (typ.equals("Deser")) {
				String calories = s.next();
				Dessert dessert = new Dessert(name, preparationTime, numberOfPeople, preparation, difficulty, calories);
				addIngredientsToMeal(ingredients, dessert);
				meals.add(dessert);

			} else if (typ.equals("Zupa")) {
				boolean wegeMax = Boolean.getBoolean(s.next());
				try {
					Soup soup = new Soup(name, preparationTime, numberOfPeople, preparation, difficulty, wegeMax);
					addIngredientsToMeal(ingredients, soup);
					meals.add(soup);
				} catch (TimeConsuming e) {
					e.printStackTrace();
					System.out.println("Zbyt czasoch³onny przepis");
				}
			}

			else if (typ.equals("DanieGlowne")) {
				boolean wege = Boolean.getBoolean(s.next());
				MainCourse meal = new MainCourse(name, preparationTime, numberOfPeople, preparation, difficulty, wege);
				addIngredientsToMeal(ingredients, meal);
				meals.add(meal);
			} else {
				System.out.println("nie zapisuje takich przpisow");
			}
			s.nextLine();

		}
		return meals;
	}
	
	private static void addIngredientsToMeal(String[] ingredients, Meal meal){
		for (int i = 0; i < ingredients.length; i++) {
			String[] productQantity = ingredients[i].split("-", 2);
			
			int ilosc = Integer.parseInt(productQantity[1]);
			meal.addIngredient(productQantity[0], ilosc);
		}
	}
}