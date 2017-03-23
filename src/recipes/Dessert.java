package recipes;

import java.util.HashMap;

public class Dessert extends Meal {

	String calories;

	Dessert(int time, int people, String preparing, String difficulty, String kalorie) {
		super(time, people, preparing, difficulty);
		// TODO Auto-generated constructor stub
		calories = kalorie;
		
	}

	@Override
	public String toString() {
		return super.toString() + " i [kalorycznosc=" + calories + "]";
	}
	
	@Override
	public void addIngredient(String produkt, Integer ilosc)  {
		try {
			addDessertIngredient(produkt, ilosc);
		} catch (TooComplicated e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void addDessertIngredient(String product, Integer ilosc) throws TooComplicated {
		if (ingredients.size() >= 7) {
			throw new TooComplicated("Wymaga zbyt wielu sk³adników");
		}
		ingredients.put(product, ilosc);
	}

}
