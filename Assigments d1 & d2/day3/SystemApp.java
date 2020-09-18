package day3;

import java.util.ArrayList;



import java.util.*;

public class SystemApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> arr = new ArrayList<>();
		arr.add(new SalEmp(10000.0));
		
		arr.add(new HourEmp(400.0));
		arr.add(new ComEmp(50.0));
		
		for (Employee emp : arr) {
			System.out.println("Salary=" + emp.getPayment() + "\n");
		}
		
		arr.get(0).increaseSalary(50.9);
		arr.get(1).increaseSalary(45.7);
		arr.get(2).increaseSalary(20.9);
		
		System.out.println("=========================================================================");
		for (Employee emp : arr) {
			System.out.println("Salary=" + emp.getPayment() + "\n");
		
	}

}
}