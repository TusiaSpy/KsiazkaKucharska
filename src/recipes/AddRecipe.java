package recipes;

import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class AddRecipe {

	public List<Meal> meals = new ArrayList<Meal>();
	private Scanner s;

	public List<Meal> add() throws FileNotFoundException{
		File plik = new File("desery.txt");
		s = new Scanner(plik);
		s.useDelimiter(";");
		while (s.hasNextLine()) {
			String typ = s.next();
			if (!typ.equals("Deser") && !typ.equals("Zupa") && !typ.equals("DanieGlowne")  ) {
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
				Dessert dessert = new Dessert(preparationTime, numberOfPeople, preparation, difficulty, calories);
				//for
				//Maka 2, Jajka 5,...
				for ( int i=0; i<ingredients.length ; i++){
					String[] productQantity = ingredients[i].split(" ",2); 
					//maka, 2
					int ilosc = Integer.parseInt(productQantity[1]);
					dessert.addIngredient(productQantity[0], ilosc);
					
					
				}
				dessert.addIngredient(ingredients[0], 0);
						meals.add(dessert);

			} else if (typ.equals("Zupa")) {
				boolean wegeMax = Boolean.getBoolean(s.next());
				try {
					meals.add(new Soup(preparationTime, numberOfPeople, preparation, difficulty, wegeMax));
				} catch (TimeConsuming e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println("Zbyt czasoch³onny przepis");
				}
			}

			else if (typ.equals("DanieGlowne")) {
				boolean wege = Boolean.getBoolean(s.next());
				meals.add(new MainCourse(preparationTime, numberOfPeople, preparation, difficulty, wege));
			} else {
				System.out.println("nie zapisuje takich przpisow");
			}
			s.nextLine();

		}
		return meals;
	}
}