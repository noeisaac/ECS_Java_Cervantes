
import java.util.Random;

public class ShorterDoubleDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		int roll1 = 1 + r.nextInt(6); 
		int roll2 = 1 + r.nextInt(6);
		do
		{
			System.out.println("Here comes the dice!");
			System.out.println("Roll #1: " + roll1);
			System.out.println("Roll #2: " + roll2);
			System.out.println("The total is " + (roll1 + roll2) + "!");
			roll1 = 1 + r.nextInt(6);
			roll2 = 1 + r.nextInt(6);
		} while ( roll1 != roll2 );
		
		if ( roll1 == roll2 )
		{
			System.out.println("They match!");
		}


	}

}