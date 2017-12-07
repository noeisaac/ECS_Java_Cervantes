import java.util.Scanner;

public class HowOldSpecifically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.println( "Hey, what's your name? " );
		name = keyboard.next();
		System.out.println( "Ok " + name + ", how old are you? " );
		age = keyboard.nextInt();
		
		if ( age < 16 )
		{
			System.out.println( "You cannot drive. " );
		}
		else if ( age > 15 && age < 18 )
		{
			System.out.println( "You can drive but not vote." );
			
		}
		else if ( age > 17 && age < 25 )
		{
			System.out.println( "You can vote but not rent a car." );
			
		}
		if ( age > 24 )
		{
			System.out.println( "You can pretty much do whatever you want." );
		}

	}

}
