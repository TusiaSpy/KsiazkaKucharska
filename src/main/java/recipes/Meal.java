package main.java.recipes;

import java.util.HashMap;
import java.util.Map;

public abstract class Meal {
	int preparationTime;
	int NumberOfPeople;
	String preparation;
	String complication;
	Map<String, Integer> ingredients = new HashMap<String, Integer>();

	public void addPrepartion(String activities) {
		preparation = activities;

	}

	public Meal(int time, int people, String preparing, String difficulty) {
		preparationTime = time;
		NumberOfPeople = people;
		preparation = preparing;
		complication = difficulty;
		ingredients = (Map<String, Integer>) new HashMap<String, Integer>();
	}

	@Override
	public String toString() {
		return "Danie [=" + "czasPrzygotowania=" + preparationTime + ", dlaIluOsob=" + NumberOfPeople
				+ ", sposobPrzygotowania=" + preparation + ", stopienTrudnosci=" + complication + ", skladniki="
				+ ingredients + "]";
	}

	public void addIngredient(String produkt, Integer ilosc) {
		((HashMap<String, Integer>) ingredients).put(produkt, ilosc);
	}

	// funkcjonalnosc dieki ktorej srawdziwmy czy dany przepis zawira dany
	// skaladnik
	// 1. nazwa fuknkcji
	// 2. parametry
	// 3. co zwraca
	// 4. implementacja
	public boolean haveEnoughProducts(String produkt, Integer howMuchIhave) {
		if (ingredients.containsKey(produkt)) {
			return ingredients.get(produkt) <= howMuchIhave;
		}
		return false;
	}
}