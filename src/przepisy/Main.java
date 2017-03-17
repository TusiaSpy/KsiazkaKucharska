package przepisy;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		WczytywaczPrzepisu wczytywacz = new WczytywaczPrzepisu();
		System.out.println(wczytywacz.wczytaj());
		
	}
	
	

	static void jakiesSmieci() {
		ArrayList<String> skladniki = new ArrayList<String>();
		skladniki.add("ziemniaki");
		skladniki.add("makaron");
		skladniki.add("ryz");
		skladniki.add("marchew");
		skladniki.add("szpinak");
		skladniki.add("piers z kurczaka");
		skladniki.add("czosnek");
		skladniki.add("mleko");
		skladniki.add("maka");

		System.out.println(Arrays.toString(skladniki.toArray()));
		// TODO Auto-generated method stub

		skladniki.add(1, "kasza");
		System.out.println(Arrays.toString(skladniki.toArray()));

		skladniki.remove(2);
		System.out.println(Arrays.toString(skladniki.toArray()));

		skladniki.set(4, "pieprz");
		System.out.println(Arrays.toString(skladniki.toArray()));

		System.out.println(skladniki.contains("szpinak"));
		System.out.println(skladniki.contains("mleko"));

		Zupa buraczkowa = null;
		try {
			buraczkowa = new Zupa(10, 3, "zagotuj wode", "latwe", true);
		} catch (ZbytCzasochlonne e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		buraczkowa.dodajSkladnik("buraki");
		buraczkowa.dodajSkladnik("woda");
		buraczkowa.dodajSkladnik("marchew");
		System.out.println(buraczkowa);
		buraczkowa.dodajSposobPrzygotowania("Umyj buraki");
		System.out.println(buraczkowa);
		DanieGlowne schabowy = new DanieGlowne(45, 2, "ubij kotleta", "srednio trudne", false);
		schabowy.dodajSkladnik("kotlet wieprzowy");
		schabowy.dodajSkladnik("bulka tarta");
		schabowy.dodajSkladnik("jajka");
		System.out.println(schabowy);
		Deser sernik = new Deser(30, 4, "zmiel twarog", "trudne", "wysokokaloryczne");

		try {
			sernik.dodajSkladnikDeseru("ser");

			sernik.dodajSkladnikDeseru("jajka");
			sernik.dodajSkladnikDeseru("maka");
			sernik.dodajSkladnikDeseru("cukier");
		} catch (ZbytSkomplikowane e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(sernik);

	}

}
