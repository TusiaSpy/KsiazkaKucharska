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

	
			sernik.addIngredient("ser", 2);

			sernik.addIngredient("jajka", 3);
			sernik.addIngredient("maka", 4);
			sernik.addIngredient("cukier", 2);
		
		}
}



