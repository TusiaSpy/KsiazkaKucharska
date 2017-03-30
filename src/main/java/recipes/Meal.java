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

	Meal(int time, int people, String preparing, String difficulty) {
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

	void addIngredient(String produkt, Integer ilosc) {
		((HashMap<String, Integer>) ingredients).put(produkt, ilosc);
	}
}