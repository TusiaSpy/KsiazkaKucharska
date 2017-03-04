package przepisy;

import java.util.ArrayList;

public abstract class Danie {
	int czasPrzygotowania;
	int dlaIluOsob;
	String sposobPrzygotowania;
	String stopienTrudnosci;
	ArrayList<String> skladniki;

	public void dodajSposobPrzygotowania (String sposobPostepowania){
		 sposobPrzygotowania = sposobPostepowania;
	}

	@Override
	public String toString() {
		return "Danie [czasPrzygotowania=" + czasPrzygotowania + ", dlaIluOsob=" + dlaIluOsob + ", sposobPrzygotowania="
				+ sposobPrzygotowania + ", stopienTrudnosci=" + stopienTrudnosci + ", skladniki=" + skladniki + "]";
	}
	
}
 