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
		
		Zupa buraczkowa = new Zupa();
		System.out.println(buraczkowa);
		buraczkowa.dodajSposobPrzygotowania("Umyj buraki");
		System.out.println(buraczkowa);
		
		Deser sernik = new Deser("niskokaloryczny", 10);
		System.out.println(sernik);
	

	 	Deser sernik2 = new Deser("wysokokaloryczne", 6);
		System.out.println(sernik2);
	}

	
}
