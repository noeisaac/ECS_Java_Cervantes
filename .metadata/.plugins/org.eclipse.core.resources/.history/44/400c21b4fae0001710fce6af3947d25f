import java.util.Random;
import java.util.Scanner;

public class NumbGuessCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int guess, number = 1 + r.nextInt(10);
		
		System.out.println("I have a number between 1 and 10. Try to guess it.");
		System.out.println("Your guess:");
		guess = keyboard.nextInt();
		
		do
		{
			System.out.println("That is incorrect. Guess again.");
			System.out.println("Your guess:");
			guess = keyboard.nextInt();
		} while (guess != number);
		if (guess == number)
			{
			System.out.println("Thats right! You're a good guesser.");
			}
		

	}

}

