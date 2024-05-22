package java8features.comparator;

import java.util.Comparator;

public class Student2 implements Comparator<Student2> {

	private int id;
	private String name;
	private int age;
	
	public Student2() {
		
	}

	public Student2(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/*
	 * @Override public int compareTo(Student2 s) { return this.age - s.age; }
	 */

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compare(Student2 o1, Student2 o2) {
		return o1.getName().compareTo(o2.getName());
	}
	

}
