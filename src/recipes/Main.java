package recipes;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {

		AddRecipe adding = new AddRecipe();
		System.out.println(adding.add());
		
	}
	
	

	static void jakiesSmieci() {
		ArrayList<String> ingredients = new ArrayList<String>();
		ingredients.add("ziemniaki");
		ingredients.add("makaron");
		ingredients.add("ryz");
		ingredients.add("marchew");
		ingredients.add("szpinak");
		ingredients.add("piers z kurczaka");
		ingredients.add("czosnek");
		ingredients.add("mleko");
		ingredients.add("maka");

		System.out.println(Arrays.toString(ingredients.toArray()));
		// TODO Auto-generated method stub

		ingredients.add(1, "kasza");
		System.out.println(Arrays.toString(ingredients.toArray()));

		ingredients.remove(2);
		System.out.println(Arrays.toString(ingredients.toArray()));

		ingredients.set(4, "pieprz");
		System.out.println(Arrays.toString(ingredients.toArray()));

		System.out.println(ingredients.contains("szpinak"));
		System.out.println(ingredients.contains("mleko"));

		Soup buraczkowa = null;
		try {
			buraczkowa = new Soup(10, 3, "zagotuj wode", "latwe", true);
		} catch (TimeConsuming e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		buraczkowa.addIngredient("buraki", 0);
		buraczkowa.addIngredient("woda", 0);
		buraczkowa.addIngredient("marchew", 0);
		System.out.println(buraczkowa);
		buraczkowa.addPrepartion("Umyj buraki");
		System.out.println(buraczkowa);
		MainCourse schabowy = new MainCourse(45, 2, "ubij kotleta", "srednio trudne", false);
		schabowy.addIngredient("kotlet wieprzowy", 0);
		schabowy.addIngredient("bulka tarta", 0);
		schabowy.addIngredient("jajka", 0);
		System.out.println(schabowy);
		Dessert sernik = new Dessert(30, 4, "zmiel twarog", "trudne", "wysokokaloryczne");

		try {
			sernik.addDessertIngredient("ser");

			sernik.addDessertIngredient("jajka");
			sernik.addDessertIngredient("maka");
			sernik.addDessertIngredient("cukier");
		} catch (TooComplicated e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(sernik);

	}

}
