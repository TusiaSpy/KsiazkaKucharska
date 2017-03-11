package przepisy;

public class Deser extends Danie {

	String kalorycznosc;

	Deser(int czas, int osoby, String przygotowanie, String trudnosc, String kalorie) {
		super(czas, osoby, przygotowanie, trudnosc);
		// TODO Auto-generated constructor stub
		kalorycznosc = kalorie;
		
	}

	@Override
	public String toString() {
		return super.toString() + " i [kalorycznosc=" + kalorycznosc + "]";
	}
	
	void dodajSkladnikDeseru(String produkt) throws ZbytSkomplikowane {
		if (skladniki.size() >= 3) {
			throw new ZbytSkomplikowane("Wymaga zbyt wielu sk³adników");
		}
		skladniki.add(produkt);
	}

}
