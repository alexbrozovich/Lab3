import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		
		//start scanner
		Scanner scan = new Scanner(System.in);
		
		//ask for integer input
		System.out.print("Please enter an integer: ");
		int userInt = scan.nextInt();
		
		//print header
		System.out.println("Number ------ Square ------ Cube");
		
		//for loop until i == userInteger
		for (int i = 1; i <= userInt; i++) {
			System.out.printf("%d        %d        %d %n", i, (i*i), (i*i*i));
		}
		
		//wrap the whole thing in a loop to ask to continue
	}

}
