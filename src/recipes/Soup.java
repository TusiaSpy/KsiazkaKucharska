package recipes;

public class Soup extends Meal {

	boolean weganskie;

	Soup(int czas, int osoby, String przygotowanie, String trudnosc, boolean wegeMax) throws TimeConsuming {
		super(czas, osoby, przygotowanie, trudnosc);
		weganskie = wegeMax;
		if (czas > 60){
			throw new TimeConsuming("Za dlugi czas przygotowania");
	
		}
	}

	@Override
	public String toString() {
		return super.toString() + " i [weganskie=" + weganskie + "]";
	}
}