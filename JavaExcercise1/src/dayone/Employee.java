package dayone;

public class Employee {
	
	private String name;
	private int hours;
	private double salary;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(String name, int hours, double salary) {
		super();
		this.name = name;
		this.hours = hours;
		this.salary = salary;
	}

	public static void main(String[] args) {
		Employee emp = new Employee("abc", 8, 900);
		emp.getInfo(emp.getHours(), emp.getSalary());
	}
	
	public void addWork() {
		if(getHours()>6) {
			salary += 500;
		}
	}
	public void addSal() {
		if(getSalary()<1500) {
			salary += 1000;
		}
	}
	public void getInfo(int hours, double salary) {
		addWork();
		addSal();
		System.out.println("name : "+getName());
		System.out.println("hours : "+getHours());
		System.out.println("salary : "+getSalary());
	}

}
