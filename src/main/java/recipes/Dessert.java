package main.java.recipes;

public class Dessert extends Meal implements Bakeable {

	String calories;

	public Dessert(String name, int time, int people, String preparing, String difficulty, String kalorie) {
		super(name, time, people, preparing, difficulty);
		calories = kalorie;

	}

	@Override
	public String toString() {
		return super.toString() + " i [kalorycznosc=" + calories + "]";
	}

	@Override
	public void addIngredient(String produkt, Integer ilosc) {
		try {
			addDessertIngredient(produkt, ilosc);
		} catch (TooComplicated e) {
			e.printStackTrace();
		}
	}

	private void addDessertIngredient(String product, Integer ilosc) throws TooComplicated {
		if (ingredients.size() >= 7) {
			throw new TooComplicated("Wymaga zbyt wielu sk³adników");
		}
		ingredients.put(product, ilosc);
	}

	public void BakeMe() {
		int czasPieczenia = this.preparationTime * 3 / 4;
		System.out.println("Bede sie piekl przez " + czasPieczenia);

	}


}
