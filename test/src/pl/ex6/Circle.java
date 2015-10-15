package pl.ex6;

public class Circle extends Shape {

	private int x, y;
	private double radius;
	
	public Circle(String desc, int x, int y, double radius) {
		super(desc);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double circumferenceLength(){
		return 2 * getRadius() * Math.PI;
	}
	
	public double area(){
		return Math.PI * getRadius() * getRadius();
	}
	
}
