import java.util.Scanner;

public class UserInputOfData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		String first, last, login;
		int grade, id, gpa;
		
		System.out.println( "Please enter the following information so I can sell it for a profit!" );
		System.out.println( "                                                                     " );
		
		System.out.println( "First name: " );
		first = keyboard.next();
		System.out.println( "Last name: " );
		last = keyboard.next();
		System.out.println( "Grade (9-12): " );
		grade = keyboard.nextInt();
		System.out.println( "Student ID: " );
		id = keyboard.nextInt();
		System.out.println( "Login: " );
		login = keyboard.next();
		System.out.println( "GPA (0.0-4.0): " );
		gpa = keyboard.nextInt();
		
		keyboard.close();
		
		System.out.println( "                                                                     " );
		
		System.out.println( "Your Information: " );
		System.out.println( "        Login: " + login );
		System.out.println( "        ID:    " + id );
		System.out.println( "        Name:  " + last + ", " + first );
		System.out.println( "        GPA:   " + gpa );
		System.out.println( "        Grade: " + grade );
		
		
		
		

	}

}
