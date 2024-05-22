package java8features.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample {

	public static void main(String[] args) {
		List<Student2> list = new ArrayList<>();
		list.add(new Student2(5, "ramesh", 18));
		list.add(new Student2(2, "suresh", 19));
		list.add(new Student2(3, "mahesh", 17));
		
		//the sort function in collections use comparable and comparator interfaces
		//here we are providing the sort order for the object in StudentIDComparator which is based on the id
		
		StudentIDComparator id = new StudentIDComparator();
		Collections.sort(list,id);
		
		for (Student2 student : list) {
			System.out.println(student);
		}
		System.out.println("comparing using name");
		//in below sort function we are sorting based on the name of the object which is provided in the Student2
		Student2 sname = new Student2();
		Collections.sort(list,sname);
		for (Student2 student : list) {
			System.out.println(student);
		}
		
	}

}
