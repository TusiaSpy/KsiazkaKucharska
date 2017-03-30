package main.java.recipes;

public class Soup extends Meal {

	boolean vege;

	Soup(int time, int people, String preparation, String difficulty, boolean veg) throws TimeConsuming {
		super(time, people, preparation, difficulty);
		vege = veg;
		if (time > 60){
			throw new TimeConsuming("Za dlugi czas przygotowania");
	
		}
	}

	@Override
	public String toString() {
		return super.toString() + " i [weganskie=" + vege + "]";
	}
}