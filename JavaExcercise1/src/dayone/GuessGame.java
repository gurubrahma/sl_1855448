package dayone;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	public static void main(String[] args) {
		Random random = new Random();
		int randonNum = random.nextInt(50);
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter your guess from 1 to 50");
			int guess = scanner.nextInt();
			if(randonNum == guess) {
				System.out.println("you guessed correct number \""+randonNum+"\"");
				break;
			}
			if(randonNum > guess) {
				System.out.println("you guess is low ");
			}
			if(randonNum < guess) {
				System.out.println("you guess is high ");
			}
		} while (randonNum >0);
	}

}
