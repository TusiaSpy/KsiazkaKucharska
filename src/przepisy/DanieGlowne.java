package przepisy;

public class DanieGlowne extends Danie {

	boolean wegetarianskie;

	DanieGlowne(int czas, int osoby, String przygotowanie, String trudnosc, boolean wege) {
		super(czas, osoby, przygotowanie, trudnosc);
		wegetarianskie = wege;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + " i [wegetarianskie=" + wegetarianskie + "]";
	}
}