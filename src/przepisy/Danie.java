package przepisy;

import java.util.ArrayList;

public abstract class Danie {
	int czasPrzygotowania;
	int dlaIluOsob;
	String sposobPrzygotowania;
	String stopienTrudnosci;
	ArrayList<String> skladniki;

	public void dodajSposobPrzygotowania(String sposobPostepowania) {
		sposobPrzygotowania = sposobPostepowania;
	}

	Danie(int czas, int osoby, String przygotowanie, String trudnosc) {
		czasPrzygotowania = czas;
		dlaIluOsob = osoby;
		sposobPrzygotowania = przygotowanie;
		stopienTrudnosci = trudnosc;
		skladniki = new ArrayList<String>();
	}

	@Override
	public String toString() {
		return "Danie [czasPrzygotowania=" + czasPrzygotowania + ", dlaIluOsob=" + dlaIluOsob + ", sposobPrzygotowania="
				+ sposobPrzygotowania + ", stopienTrudnosci=" + stopienTrudnosci + ", skladniki=" + skladniki + "]";
	}

	void dodajSkladnik(String produkt)  {
		skladniki.add(produkt);
	}
}