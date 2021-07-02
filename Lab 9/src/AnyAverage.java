
import java.util.Scanner;

public class AnyAverage {

	public static void main(String[] args) {
		System.out.println("This program will find the average of numbers");
		System.out.println("Please choose amount of numbers to average : ");
		Scanner input = new Scanner(System.in);
 
		int count, total,i  ;
		double Avg;
int max = input.nextInt();
count = 0;
total = 0;
		
while (count < max) {
	count++;
	System.out.println("Insert Number " + count);
	i = input.nextInt();
	total = total + i;
	

	
		
		}
	Avg = ((double)total/max);
	if (Avg % 2 == 0){
	System.out.println("The average is : " + ((int)Avg));
	}
	else{
		System.out.println("The average is : " + Avg);
	}
	}
}