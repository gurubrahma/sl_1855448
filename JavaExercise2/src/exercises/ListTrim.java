package exercises;

import java.util.ArrayList;
import java.util.List;

public class ListTrim {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<>();
		lst.add("   aaaaa");
		lst.add("b  bbb    ");
		lst.add("ccccc    ");
		for (String string : lst) {
			System.out.println(string.trim()+" - "+ string.trim().length());
		}
	}

}
