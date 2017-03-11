package przepisy;

import java.util.ArrayList;
import java.util.Scanner;

public class WczytywaniePrzepisu {
public static void WczytywaniePrzepisu(){
	Scanner s = new Scanner(System.in);
	Danie przepis = new Danie;
	while(s.hasNextLine()){
		String typ = s.next();
		String nazwa = s.next();
		int  czasPrzygotowania = s.next();
		int dlaIluOsob = s.nextInt();
		
		if(typ.equals("Deser")){
			String kalorie = s.next();
			Danie.add(new przepisy.Deser.Deser( czas,  osoby,  przygotowanie,  trudnosc,  kalorie)

;
		}
		else if(typ.equals("Zupa")){
			String wegeMax = s.next();
			pojazdy.add(new Samolot(nazwa, kolor, przebieg, cena, linieLotnicze));
		}
		
		else if(typ.equals("DanieGlowne")){
			String wege = s.next();
			pojazdy.add(new Statek(nazwa, kolor, przebieg, cena));
		}
		else{
			 // jakis wyjatek, ze niedozwolony typ dania		}
	}
String trudnosc;
String skladniki;
String sposobPrzygotowania;

}
}
}