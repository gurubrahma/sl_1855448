package dayone;

import java.util.Scanner;

public class FromNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter starting number :");
		int from = scanner.nextInt();
		System.out.println("Enter Ending number :");
		int to = scanner.nextInt();
		while(from <= to) {
			System.err.println(from);
			from++;
		}
		scanner.close();
	}

}
