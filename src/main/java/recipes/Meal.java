package main.java.recipes;

import java.util.HashMap;
import java.util.Map;

public abstract class Meal {
	String name;
	int preparationTime;
	int NumberOfPeople;
	String preparation;
	String complication;
	Map<String, Integer> ingredients = new HashMap<String, Integer>();

	public void addPrepartion(String activities) {
		preparation = activities;
	}

	public Meal(String name, int time, int people, String preparing, String difficulty) {
		this.name = name;
		preparationTime = time;
		NumberOfPeople = people;
		preparation = preparing;
		complication = difficulty;
		ingredients = (Map<String, Integer>) new HashMap<String, Integer>();
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Meal [name=" + name + ", preparationTime=" + preparationTime + ", NumberOfPeople=" + NumberOfPeople
				+ ", preparation=" + preparation + ", complication=" + complication + ", ingredients=" + ingredients
				+ "]";
	}

	public void addIngredient(String produkt, Integer ilosc) {
		((HashMap<String, Integer>) ingredients).put(produkt, ilosc);
	}

	public boolean hasEnoughProducts(String produkt, Integer howMuchIhave) {
		if (ingredients.containsKey(produkt)) {
			return ingredients.get(produkt) <= howMuchIhave;
		}
		return false;
	}
	
	public boolean hasProduct(String produkt) {
		return ingredients.containsKey(produkt);
	}
}