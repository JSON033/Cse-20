import java.util.Scanner;

public class Number {

	private static final char A = 0;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 0-25: ");
		double num = input.nextInt();
		
		if (num > 25)
		System.out.print("Out of range ");
		else if (num < 0)
			System.out.print("Out of range ");
		else {
		System.out.print( num + " character of the alphabet is "  );
		System.out.println((char)(65 + num));}
	}

}
