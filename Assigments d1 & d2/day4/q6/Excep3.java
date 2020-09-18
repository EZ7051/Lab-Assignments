package day4.q6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excep3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = null;
		while (true) {
			System.out.println("Enter number or enter -1 to quit");
			try {
				sc = new Scanner(System.in);
				int num = sc.nextInt();

				if (num == -1)
					break;
				
				if(num > 100)
					throw new InputException(num);

				if (num % 2 == 0)
					System.out.println("evn");
				else
					System.out.println("odd");
				

			} catch (InputMismatchException e) {

				System.out.println("must enter a integer");
			}
			catch(InputException e) {
				System.out.println(e.getMessage());
			}

		}

		sc.close();

	}

}
