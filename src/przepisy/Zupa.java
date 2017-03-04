package przepisy;

public class Zupa extends Danie {

	boolean weganskie;

	Zupa(int czas, int osoby, String przygotowanie, String trudnosc, boolean wegeMax) {
		super(czas, osoby, przygotowanie, trudnosc);
		weganskie = wegeMax;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + " i [weganskie=" + weganskie + "]";
	}
}