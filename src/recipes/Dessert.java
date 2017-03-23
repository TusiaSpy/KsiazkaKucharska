package recipes;

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
	
	void addDessertIngredient(String product) throws TooComplicated {
		if (ingredients.size() >= 7) {
			throw new TooComplicated("Wymaga zbyt wielu sk³adników");
		}
		ingredients.put(product, 0);
	}

}
