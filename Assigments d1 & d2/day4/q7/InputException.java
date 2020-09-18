package day4.q7;

public class InputException extends Exception{
	public InputException(int n) {
		super("No can't be > "+n);
		
		
	}
}
