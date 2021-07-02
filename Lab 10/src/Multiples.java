import java.util.Scanner;
public class Multiples {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter the max number :");
		int max = input.nextInt();
		
		System.out.println("Enter the base number :");
		int base = input.nextInt();
	 
		
	
		for (int i = 1; i <= (max/base); i++){
			System.out.println("Number is " + i * base);
		}

	}

}
