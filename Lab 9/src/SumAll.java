import java.util.Scanner;

public class SumAll {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the max number:");	
	int max = input.nextInt();
	int i = 0;
	int sum = 0;
	while ( i <= max) {
System.out.println("Number " + i);
		sum = i + sum;
if (max > 0){
	i++;
}
	else if (max < 0){
		i--;
		
		}
	}

System.out.println("Sum : " + sum);
	
}
}
