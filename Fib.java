package d1;

import java.util.Scanner;

public class Fib {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		System.out.println("The first "+num+" Fibonacci numbers are");
		
		int f1 = 1;
		int f2 = 1;
		int f3;
		double avg = f1+f2;
		
		System.out.print(f1);
		System.out.print(" ");
		System.out.print(f2);
		System.out.print(" ");
		
		for(int i=2;i<num;i++)
		{
			f3 = f1+f2;
			avg+=f3;
			System.out.print(f3);
			System.out.print(" ");
			f1 = f2;
			f2 = f3;	
		}
		
		System.out.println();
		System.out.print("Avg is ");
		System.out.println(avg/num);
		
		
		

	}

}
