import java.util.Scanner;
public class Errors1 {

	public static void main(String[] args) {
		//System.out.println("Can you spot and fix the errors?); 
		/*Quotation mark was missing*/ 
		System.out.println("Can you spot and fix the errors?");

		System.out.println("Enter two numbers and I ");
		System.out.println("add them for you");

		int n1, n2;

		//Scanner keyboard = new Scanner(System.in)
		/* there was no scanner existing and also a semicolon was missing*/
		Scanner keyboard = new Scanner(System.in);
		//n1 = nextInt();
		n1 = keyboard.nextInt();
		/*I put keyboard in there so it knows where to get the input from*/
		//n2 = nextint();
		/* PUt keyboard in there and also capitalized the letter I in Int*/
		n2 = keyboard.nextInt();

		//System.println("The sum of the numbers is");
				/* I put an out in the code so its an output*/
				System.out.println("The sum of the numbers is");
				System.out.println(n1 + n2);
	}
}