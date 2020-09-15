package d1;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {

		System.out.println("Enter the number of students: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] grds = new int[100];
		double sum = 0;

		grades(scan, num, grds);

		for (int i : grds)
			sum += i;

		System.out.println("The average is: " + sum / num);

	}

	private static void grades(Scanner scan, int num, int[] grds) {
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the grade for student " + (i + 1) + ": ");
			int grd = scan.nextInt();
			if (grd >= 0 && grd <= 100) {
				grds[i] = grd;
			} else {
				System.out.println("Invalid grade, try again..");
				i--;
				continue;
			}

		}
	}

}
