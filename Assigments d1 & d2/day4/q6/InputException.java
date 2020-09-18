package day4.q6;

public class InputException extends Exception{
	public InputException(int n) {
		super("No can't be > "+n);
		
		
	}
}
