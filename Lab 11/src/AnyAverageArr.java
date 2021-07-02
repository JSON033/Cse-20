import java.util.Scanner;
public class AnyAverageArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("This program will find the average of any numbers");
		System.out.print("Please choose amount of numbers to average : ");
		
		int max = input.nextInt();
		int i = 1;
		int[]arr1 = new int[max +1];
		int sum = 0;
		i =1;
		while (i <= max ) {
			System.out.print("Please enter " + i + " number: ");
			arr1[i]  = input.nextInt();
			i++;
		}
		System.out.println("The numbers being averaged:");
		
		for (i =1; i <= max; i++) {
			if (i % 5 != 0){
				System.out.print(arr1[i] + " ");
				
			}
			else {
				System.out.println(arr1[i]);
			}


		
	}
		for ( i = 1; i<= max; i++) {
			sum = arr1[i] + sum;
		}
		
		if (max % 5 != 0){
		System.out.println("");
		}
		 System.out.println("Average is : " + sum/max);
	}}
