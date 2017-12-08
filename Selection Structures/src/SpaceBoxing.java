import java.util.Scanner;

public class SpaceBoxing {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		int  weight, number;
		
		System.out.println( "Please enter your current earth weight:" );
		weight = keyboard.nextInt();
		System.out.println( "                                       " );
		System.out.println( "I have information for the following planets:" );
		System.out.println( "  1. Venus   2. Mars    3. Jupiter" );
		System.out.println( "  4. Saturn  5. Uranus  6. Neptune" );
		System.out.println( "                                       " );
		System.out.println( "Which planet are you visiting?" );
		number = keyboard.nextInt();
		
		if ( 0 < number && number < 2 )
		{
			System.out.println( "Your weight would be " + ( weight * .78 ) + " pounds on that planet." );	
		}
		if ( 1 < number && number < 3 )
		{ 
			System.out.println( "Your weight would be " + ( weight * .39 ) + " pounds on that planet." );
		}
		if ( 2 < number && number < 4 )
		{
			System.out.println( "Your weight would be " + ( weight * 2.65 ) + " pounds on that planet." );
		}
		if ( 3 < number && number < 5 )
		{
			System.out.println( "Your weight would be " + ( weight * 1.17 ) + " pounds on that planet." );
		}
		if ( 4 < number && number < 6 )
		{
			System.out.println( "Your weight would be " + ( weight * 1.05 ) + " pounds on that planet." );
		}
		if ( 5 < number && number < 7 )
		{
			System.out.println( "Your weight would be " + ( weight * 1.23 ) + " pounds on that planet." );
		}
		
		keyboard.close();
		

	}

}
