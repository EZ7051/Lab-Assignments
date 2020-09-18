package day3;



public class PaySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice i1 = new Invoice("1", "keyboard", 80, 5000.68);
		Invoice i2 = new Invoice("2", "Earphones", 100, 3000.89);
		Employee e1 = new SalEmp(10340.23);
		Employee e2 = new HourEmp(403.3);
		Employee e3 = new ComEmp(50.2);
		System.out.println(" payment: " + i1.getPayment() + "\n");
		System.out.println(" payment: " + i2.getPayment() + "\n");
		System.out.println(" salary: " + e1.getPayment() + "\n");
		System.out.println(" salary: " + e2.getPayment() + "\n");
		System.out.println(" salary: " + e3.getPayment() + "\n");
	}

}
