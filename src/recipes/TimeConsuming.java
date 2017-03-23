package recipes;

public class TimeConsuming extends Exception {

	private static final long serialVersionUID = 1L;
	public TimeConsuming (){}
	public TimeConsuming (String message){
		super (message);
		
	}

}
