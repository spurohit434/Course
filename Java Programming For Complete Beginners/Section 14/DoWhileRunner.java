
import java.util.Scanner;

public class DoWhileRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = 0;

		do {
			if (number > 0) {
				System.out.println("cube is " + (number * number * number));
			}
			System.out.println("Enter a number: ");
			number = sc.nextInt();
		} while (number >= 0);
		System.out.println("Thank you");

		sc.close();
	}

}
