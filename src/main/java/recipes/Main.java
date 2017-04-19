package main.java.recipes;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	
	static List<Meal> przepisy = new ArrayList<>();

	public static String getUserInput() {
		return sc.nextLine();
	}

	public static void main(String[] args) throws FileNotFoundException {

		do {
			System.out.println("1. Wczytaj przepisy z pliku");
			System.out.println("2. Znajdz przepis na podstawie skladnikow");
			System.out.println("3. Wyjscie");

			System.out.println("Wybierz, co chcesz zrobiæ:");

			int wybranyNumer = Integer.parseInt(getUserInput());

			switch (wybranyNumer) {
			case (1):
				System.out.println("Wybrales wczytywanie przepisów z pliku przepisy.txt."
						+ "Wpisz tam swoj przepis, oddzielajac jego poszczegolne parametry znakiem ;.");
				addingRecipe();
				break;

			case (2):
				System.out.println("Wybrales szukanie przepisu na podstawie skladnikow.");
				szukaniePrzepisu();
				break;

			case (3):
				return;

			default:
				System.out.println("Bledny numer polecenia.");
				break;
			}
		} while (true);

		
	}

	static void addingRecipe() {
		try {
			AddRecipe adder = new AddRecipe();
			adder.add();
		} catch (FileNotFoundException e) {
			System.out.println("Nie odnaleziono pliku");
			e.printStackTrace();
		
		}
		
// 1. Wiadomo jak chyba??
		// wpisac do zmiennej przepisy- nie kumam? metoda add dodaje do przepisu
	}

	static void szukaniePrzepisu() {
// 
		// Wpisz jakis skladnik (Odpytaj, wiadomo)
		// Na podstawie tego skladnika przeszukj przepisy
		List<Meal> listaZawezona = new ArrayList<>();
		//do
		for(Meal m : przepisy){
			if(true /*m.hasIngredint(jakisIngredientCoWprowadzil)*/){
				listaZawezona.add(m);
				System.out.println(/*m.nazwa()*/);
			}
			
		}
		
		przepisy = listaZawezona;
		//while
	}

	static void experiments() {

		Soup buraczkowa = null;
		try {
			buraczkowa = new Soup(10, 3, "zagotuj wode", "latwe", true);
		} catch (TimeConsuming e1) {
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
