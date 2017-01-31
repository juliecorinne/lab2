import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);

	String name;

	System.out.println("Hello! What is your name?");
	name = scan.nextLine();
	System.out.println();

	boolean numberGame = true;

	while (numberGame) {

		System.out.println("Hello " + name + ", please enter a number between 1 - 100: ");
		int number = scan.nextInt();
		System.out.println();

		if (number < 0 || number > 0) {
			System.out.println("That's not a valid number. Please enter a number between 1 - 100.");
			System.out.println();

		} else if (number % 2 != 0 && number > 0) {
			System.out.println("The number " + number + " is Odd.");
			System.out.println();

		} else if (number % 2 == 0 && number >= 2 && number <= 25) {
			System.out.println("Even and less than 25.");
			System.out.println();

		} else if (number % 2 == 0 && number >= 26 && number <= 60) {
			System.out.println("Even.");
			System.out.println();

		} else if (number % 2 == 0 && number > 60 && number <= 100) {
			System.out.println("The number " + number + " is Even.");
			System.out.println();

		} else if (number % 2 != 0 && number > 60 && number <100) {
			System.out.println("Odd.");
			System.out.println();
		}

		System.out.println("Would you like to try another number? Y/N");
		char y = scan.next().charAt(0);
		System.out.println();

			if (y == 'Y' || y == 'y') {
				numberGame = true;

			} else {
				numberGame = false;
				System.out.println("Bye!");
			}


	}
    }
}
