package day3;

public class SalEmp extends Employee{

	private double weekRate;

	public SalEmp(double weekRate) {
		this.weekRate = weekRate;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		
		return weekRate;
	}

	@Override
	public void setSalary(double rate) {
		// TODO Auto-generated method stub\
		weekRate = rate;
		
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		System.out.println(this);
		return this.getSalary();	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SalEmp [weekRate=");
		builder.append(weekRate);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public void increaseSalary(double percent) {
		this.weekRate = this.weekRate * (1.0 +  percent / 100.0);
	}


}
