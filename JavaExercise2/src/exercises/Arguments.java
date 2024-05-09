package exercises;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class Arguments {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		for(int i= 0;i< args.length;i++) {
			set.add(args[i]);
		}
		System.out.println("args array values :");
		for (String string : args) {
			System.out.println(string);
		}
		System.out.println("args array values usinf foreach loop :");
		for (String string : set) {
			System.out.println(string);
		}
	}
}
