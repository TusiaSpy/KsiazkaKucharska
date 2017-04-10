package test.java.recipes;

import org.junit.Before;
import org.junit.Test;

import main.java.recipes.Dessert;
import main.java.recipes.Soup;
import main.java.recipes.TimeConsuming;

public class TestDessert {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Dessert sernik = new Dessert(30, 4, "zmiel twarog", "trudne", "wysokokaloryczne");

		sernik.addIngredient("ser", 2);

		sernik.addIngredient("jajka", 3);
		sernik.addIngredient("maka", 4);
		sernik.addIngredient("cukier", 2);

		boolean haveEnough = sernik.haveEnoughProducts("jajka", 2);

		System.out.println(haveEnough);

	}
	
	@Test
	public void test2() throws TimeConsuming {
		Soup rosol = new Soup(30, 5, "pokroj i ugotuj", "latwe", false);

		rosol.addIngredient("kurczak", 1);

		rosol.addIngredient("wloszczyzna", 3);
		rosol.addIngredient("makaron", 1);
		

		boolean haveEnough = rosol.haveEnoughProducts("wloszczyzna", 2);

		System.out.println(haveEnough);

	}
}