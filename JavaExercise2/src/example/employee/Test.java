package example.employee;

public class Test {

	public static void main(String[] args) {
		Employee employee = new Employee("emp","Tester",1000);
		Employee developer = new Developer("dev","Developer address",2000);
		Employee programmer = new Programmer("pro","Programmer address",1500);
		Employee manager = new Manager("mngr","Manager address",3000);
		
		System.out.println(employee.toString());
		System.out.println(developer.toString());
		System.out.println(programmer.toString());
		System.out.println(manager.toString());
		
	}

}
