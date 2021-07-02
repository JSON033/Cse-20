import java.util.Scanner;
public class SumSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
System.out.print("Please enter the max number:" );
int max = input.nextInt();
int sum = 0;
for (int i = 1; i<= max; i++) {
	System.out.println("NUmber " + i + " squared is " + i * i);
	sum = sum + (i*i);

}
System.out.println("Sum of squares are " + sum);
	}

}
