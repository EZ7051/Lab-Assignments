package day3;

public class ComEmp extends Employee{

	private double per;
	
	
	public ComEmp(double per) {
		this.per = per;
	}

	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return 10*per;
	}

	@Override
	public void setSalary(double rate) {
		// TODO Auto-generated method stub
		per = rate;
	}

	@Override
	public double getPayment() {
		// TODO Auto-generated method stub
		System.out.println(this);
		return this.getSalary();
	
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ComEmp [per=");
		builder.append(per);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public void increaseSalary(double percent) {
		this.per = this.per * (1.0 + percent / 100.0);
	}


}
