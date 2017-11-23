import java.util.Random;
import java.util.Scanner;

public class KronaKlave {

	public static void main(String[] args) {
		// Users scanner input
		Scanner userGuess = new Scanner(System.in);

		System.out.println("Select Heads or Tails");
		String usersPick = userGuess.nextLine();

		// System.out.println(usersPick);

		// Computers random Selector.
		Random randomGenerator = new Random();

		Boolean coinFlippvalue = randomGenerator.nextBoolean();

		// System.out.println(coinFlippvalue);

		if (coinFlippvalue == true) {
			System.out.println("Computer - Heads");
		} else {
			System.out.println("Computer - Tails");
		}

		if (coinFlippvalue == true && usersPick.equals("Heads")
				|| coinFlippvalue == false && usersPick.equals("Tails")) {
			System.out.println("You won!");
		} else { 
			System.out.println("You lost!");
		}

	}

}
