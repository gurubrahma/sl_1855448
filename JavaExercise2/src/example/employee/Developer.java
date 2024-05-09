package example.employee;

public class Developer extends Employee {
	private String name;
	private String address;
	private double salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Developer() {
		super();
	}
	public Developer(String name, String address, double salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public void calculateBonus() {
		System.out.println("Developer class calculateBonus method");
	}
	
	public void performanceReport() {
		System.out.println("Developer class performanceReport method");
	}
	
	public void projects() {
		System.out.println("Developer class projects method");
	}
	@Override
	public String toString() {
		return "Developer [name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	
}
