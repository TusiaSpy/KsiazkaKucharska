package przepisy;

public class Zupa extends Danie {

	boolean weganskie;

	Zupa(int czas, int osoby, String przygotowanie, String trudnosc, boolean wegeMax) throws ZbytCzasochlonne {
		super(czas, osoby, przygotowanie, trudnosc);
		weganskie = wegeMax;
		if (czas > 60){
			throw new ZbytCzasochlonne("Za dlugi czas przygotowania");
	
		}
	}

	@Override
	public String toString() {
		return super.toString() + " i [weganskie=" + weganskie + "]";
	}
}