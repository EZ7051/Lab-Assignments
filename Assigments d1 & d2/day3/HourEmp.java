package day3;

public class HourEmp extends Employee {

	private double hourRate;
	
	
	public HourEmp(double hourRate) {
		
		this.hourRate = hourRate;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return (hourRate*7*24);
	}

	@Override
	public void setSalary(double rate) {
		// TODO Auto-generated method stub
		hourRate = rate;
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		System.out.println(this);
		return this.getSalary();	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("HourEmp [hourRate=");
		builder.append(hourRate);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public void increaseSalary(double percent) {
		this.hourRate = this.hourRate * (1.0 + percent / 100.0);
	}

}
