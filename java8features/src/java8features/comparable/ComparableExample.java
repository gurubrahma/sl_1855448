package java8features.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		List<Student2> list = new ArrayList<>();
		list.add(new Student2(5, "ramesh", 18));
		list.add(new Student2(2, "suresh", 19));
		list.add(new Student2(3, "mahesh", 17));
		
		//here it takes the natural order provided in the student2 class which sort based on the age
		//the sort function in collections use comparable and comparator both
		// here it overloads the sort method with comparable interface
		Collections.sort(list);
		
		for (Student2 student : list) {
			System.out.println(student);
		}
		
	}

}
