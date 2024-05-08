package dayone;


public class Triangle {
	private int a;
	private int b;
	private int c;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public Triangle(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public static void main(String[] args) {
		
		Triangle t = new Triangle(2, 6, 7);
		System.out.println(String.format("area of the triangle : %.2f", t.area()));
		System.out.println(String.format("perimeter of the triangle : %.2f", t.perimeter()));
	}

	public double area() {
		double sp = (double)perimeter()/2;
		double area = Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
		return area;

	}

	public double perimeter() {
		return a+b+c;
	}

}
