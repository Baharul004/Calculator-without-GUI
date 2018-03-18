import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Number");
		double input = scan.nextInt();
		total = input;
		while (true) {
			System.out.println("Enter Your Sign");
			char operator = scan.next().charAt(0);
			switch (operator) {
			case '+':
				System.out.println("Enter Your number for Adding");
				input = scan.nextInt();
				total = total + input;
				System.out.println("Total After Added: " + total);
				break;

			case '-':
				System.out.println("Enter Your number for Subtracting");
				input = scan.nextInt();
				total = total - input;
				System.out.println("Total After Subtracted: " + total);
				break;

			case '/':
				System.out.println("Enter Your number for Dividing");
				input = scan.nextInt();
				total = total / input;
				System.out.println("Total After Divided: " + total);
				break;

			case '*':
				System.out.println("Enter Your number for Multipication");
				input = scan.nextInt();
				total = total * input;
				System.out.println("Total After Multiplied: " + total);
				break;

			case '=':
				System.out.println("Final value: " + total);
				System.exit(0);

			}

		}
	}

}
