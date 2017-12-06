import java.util.Scanner;

public class PartOne {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
				String name;
				int age, feet, inches;
				double weight;
				
				System.out.println("what is your name? " );
				name = keyboard.next();
				
				System.out.println( "How old are you? " );
				age = keyboard.nextInt();
				
				System.out.println( "How many feet tall are you? " );
				feet = keyboard.nextInt();
				
				System.out.println( "How many inches? ");
				inches = keyboard.nextInt();
				
				System.out.println( "How much do you weigh? " );
				weight = keyboard.nextDouble();
				
				System.out.println( "So you're name is " + name + ", you are " + age + " years old, you're " + feet + "'" + inches + " , and you weigh " + weight + "pounds." );
				
				keyboard.close(); 
		
		

	}

}
