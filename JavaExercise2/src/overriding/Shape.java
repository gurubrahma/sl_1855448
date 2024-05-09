package overriding;

public class Shape {
	
	private int side1;
	private int side2;
	
	public int getSide1() {
		return side1;
	}


	public void setSide1(int side1) {
		this.side1 = side1;
	}


	public int getSide2() {
		return side2;
	}


	public void setSide2(int side2) {
		this.side2 = side2;
	}
	
	public Shape() {
		System.out.println("shape class no arg constructor");
	}


	public Shape(int side1, int side2) {
		super();
		this.side1 = side1;
		this.side2 = side2;
	}


	public void getArea() {
		System.out.println("Shape class getArea method");
		int area = side1*side2;
		System.out.println("Area of shape :"+area);
	}
}
