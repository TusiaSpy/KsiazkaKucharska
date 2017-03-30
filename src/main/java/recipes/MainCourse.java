package main.java.recipes;

public class MainCourse extends Meal implements Bakeable {

	boolean vegetarian;

	MainCourse(int time, int people, String preparing, String difficulty, boolean vege) {
		super(time, people, preparing, difficulty);
		vegetarian = vege;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + " i [wegetarianskie=" + vegetarian + "]";
	}

	@Override
	public void BakeMe() {
		int czasPieczenia = this.preparationTime/2;
		System.out.println("Bede sie piekl przez " + czasPieczenia);
		
	}
}