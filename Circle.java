package q1;

public class Circle {
	
	private double radius;
	private String color;
	
	
	
	public Circle() {
		radius = 1.0;
		color = "red";
	}
	
	public Circle(double r) {
		this.radius = r;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getArea() {
		return (Math.PI*radius*radius);
	}



	public static void main(String[] args) {
	
		
	

	}

}
