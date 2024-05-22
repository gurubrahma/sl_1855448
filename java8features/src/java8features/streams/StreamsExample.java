package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> evenNums = nums.stream().filter(i -> i%2 ==0).collect(Collectors.toList());
		
		for (Integer integer : evenNums) {
			System.out.println(integer);
		}
		List<String> names = Arrays.asList("abc","ABC","defghi","ghi","Abc","ABCDEFG","ABCDEFG","");
		List<String> distinctNames = names.stream().filter((s)-> s.length() > 5).distinct().collect(Collectors.toList());
		for (String name : distinctNames) {
			System.out.println(name);
		}
		
	}

}
