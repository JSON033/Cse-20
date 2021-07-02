import java.util.Scanner;
public class PosAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner (System.in);
int i = 0, num, average = 0, sum = 0;

do {
	System.out.print("Enter " + i + " number: ");
	num = input.nextInt();
	i++;

	if (num <= 0){
		break;}
		sum = sum + num;
	
}
	while (num > 0 );

average = sum / (i - 1) ;

System.out.println("Average is " + average);
	}}
	
 

 
