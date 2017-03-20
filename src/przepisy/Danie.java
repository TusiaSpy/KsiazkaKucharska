package przepisy;

import java.util.ArrayList;
import java.util.HashMap;

import com.sun.javafx.collections.MappingChange.Map;

public abstract class Danie {
	int czasPrzygotowania;
	int dlaIluOsob;
	String sposobPrzygotowania;
	String stopienTrudnosci;
	Map<String, Integer> skladniki= (Map<String, Integer>) new HashMap<String, Integer>() ;

	public void dodajSposobPrzygotowania(String sposobPostepowania) {
		sposobPrzygotowania = sposobPostepowania;
	
	}

	Danie(int czas, int osoby, String przygotowanie, String trudnosc) {
		czasPrzygotowania = czas;
		dlaIluOsob = osoby;
		sposobPrzygotowania = przygotowanie;
		stopienTrudnosci = trudnosc;
		skladniki = (Map<String, Integer>) new HashMap<String, Integer>() ;
	}

	@Override
	public String toString() {
		return "Danie [czasPrzygotowania=" + czasPrzygotowania + ", dlaIluOsob=" + dlaIluOsob + ", sposobPrzygotowania="
				+ sposobPrzygotowania + ", stopienTrudnosci=" + stopienTrudnosci + ", skladniki=" + skladniki + "]";
	}


	void dodajSkladnik(String produkt, Integer ilosc)  {
		((HashMap<String, Integer>) skladniki).put(produkt, ilosc);
	}
}