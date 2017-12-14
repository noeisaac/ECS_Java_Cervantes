import java.util.Scanner;
public class CoutningMachineRevisited {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		int number, from, by;
		
		System.out.println("Count from: " );
		from = keyboard.nextInt();
		System.out.println( "Count to: " );
		number = keyboard.nextInt();
		System.out.println("Count by: " );
		by = keyboard.nextInt();
		
		for (int n = from; n <= number; n = n + by )
		{
			System.out.println(n);
		}

	}

}

