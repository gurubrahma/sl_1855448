package example.employee;

public class Manager extends Employee {
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
	public Manager() {
		super();
	}
	public Manager(String name, String address, double salary) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public void calculateBonus() {
		System.out.println("Manager class calculateBonus method");
	}
	
	public void performanceReport() {
		System.out.println("Manager class performanceReport method");
	}
	
	public void projects() {
		System.out.println("Manager class projects method");
	}
	@Override
	public String toString() {
		return "Manager [name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
	

}
