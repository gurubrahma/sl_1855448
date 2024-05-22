package java8features.comparator;

import java.util.Comparator;

public class StudentIDComparator implements Comparator<Student2> {

	@Override
	public int compare(Student2 o1, Student2 o2) {
		if(o1.getId() < o2.getId())
			return -1;
		else if(o1.getId() > o2.getId())
			return 1;
		else
			return 0;
	}

}
