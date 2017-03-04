package przepisy;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
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
		
		System.out.println( skladniki.contains("szpinak"));
		System.out.println( skladniki.contains("mleko"));
		
		Zupa buraczkowa = new Zupa(30, 3, "zagotuj wode", "latwe", true);
		System.out.println(buraczkowa);
		buraczkowa.dodajSposobPrzygotowania("Umyj buraki");
		System.out.println(buraczkowa);
		DanieGlowne schabowy = new DanieGlowne(45, 2, "ubij kotleta", "srednio trudne", false );
		System.out.println(schabowy);
		Deser sernik = new Deser(60, 10, "zmiel twarog", "trudne", "tuczace");
		System.out.println(sernik);
		
		//sernik.dodajSkladnik("ser");
		
		
		
		
	}

	
}
