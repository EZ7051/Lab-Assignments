package day4.q7;

import java.io.IOException;

public class ExceptionThrowingMethod {
	public static void throwException() throws InputException, IOException {
	}

	public static void main(String[] args) {
		// Compiler suggested to use add throws declaration, surround method with try-catch
		
		// After that 2 catch blocks have been added.
		try {
			throwException();
		} catch (InputException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
