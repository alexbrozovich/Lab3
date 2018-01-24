import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		boolean keepGoing = true;
		while (keepGoing == true) {
			// start scanner
			Scanner scan = new Scanner(System.in);

			// ask for integer input
			System.out.print("Please enter an integer: ");
			int userInt = scan.nextInt();

			// print header
			String head1 = "Number";
			String head2 = "Square";
			String head3 = "Cube";
			System.out.printf("%s %10s %10s%n", head1, head2, head3);

			// for loop until i == userInteger
			for (int i = 1; i <= userInt; i++) {
				System.out.printf("%d %13d %11d%n", i, (i * i), (i * i * i));
			}

			// wrap the whole thing in a loop to ask to continue
			System.out.println("Would you like to continue? y/n");
			char userIn = scan.next().charAt(0);
			// note that this will end the program if anything other than 'Y' or 'y' is the first character of whatever the user inputs
			if (userIn == 'y' || userIn == 'Y') {
				keepGoing = true;
			}
			else {
				keepGoing = false;
			}
		}
	}

}
