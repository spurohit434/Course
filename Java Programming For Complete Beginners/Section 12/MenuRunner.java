
import java.util.Scanner;

public class MenuRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// type obj = new type(arguement
		System.out.println("Enter number1: ");
		int num1 = sc.nextInt();
		System.out.println("The number you entered is: " + num1);

		System.out.println("Enter number2: ");
		int num2 = sc.nextInt();
		System.out.println("The number you entered is: " + num2);

		System.out.println("Choices avaialble are: ");
		System.out.println("1- Add");
		System.out.println("2- Sub");
		System.out.println("3- Mul");
		System.out.println("4- Divide");

		System.out.println("Enter choice: ");
		int choice = sc.nextInt();
		System.out.println("The choice you entered is: " + choice);

		performOperationsUsingNestedIfElse(num1, num2, choice);
		sc.close();
	}

	private static void performOperationsUsingNestedIfElse(int num1, int num2, int choice) {
		switch (choice) {
		case 1: {
			System.out.println("Result: " + num1 + num2);
			break;
		}
		case 2: {
			System.out.println("Result: " + (num1 - num2));
			break;
		}
		case 3: {
			System.out.println("Result: " + num1 * num2);
			break;
		}
		case 4: {
			System.out.println("Result: " + num1 / num2);
			break;
		}
		default: {
			System.out.println("Invalid Operation");
			break;
		}
		}
	}

}
