package przepisy;

public class Deser extends Danie {
	String kalorycznosc;

	Deser(String a, int b) {
		kalorycznosc = a;
		dlaIluOsob = b;

	}

	@Override
	public String toString() {
		return super.toString() + " i [kalorycznosc=" + kalorycznosc + "]";
	}
	
}
