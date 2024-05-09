package overriding;

public class Rectangle extends Shape{
	
	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public Rectangle(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(5, 4);
		rectangle.getArea();
		Shape shape = new Shape(4, 4);
		shape.getArea();
	}
	
	public void getArea() {
		System.out.println("Rectangle class getArea method");
		int area = length*width;
		System.out.println("Area of rectanle :"+area);
	}

}
