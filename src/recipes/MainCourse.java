package recipes;

public class MainCourse extends Meal {

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
}