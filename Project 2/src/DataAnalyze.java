import java.util.Scanner;
public class DataAnalyze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the sample size: ");
		int Sample = input.nextInt();
		int i = 1;
		int[]arr1 = new int[Sample + 1];
		int[]arr2 = new int[Sample + 1];
		int[]arr3 = new int[Sample + 1];
		int[]arr4 = new int[Sample + 1];
		int avg1=0,avg2=0,avg3=0,avg4=0;
		int max= 0, min = 0;
		System.out.println("Enter numbers for Trial 0");
		for (i = 1;i <= Sample;) {
			System.out.print("Enter sample #" + (i-1) + ":");
			arr1[i] = input.nextInt();
			i++;
		}
		for ( i = 1; i<= Sample; i++) {
			avg1 = arr1[i] + avg1;
		}

		System.out.println(" ");
		System.out.println("Enter numbers for Trial 1");
		for (i = 1;i <= Sample;) {
			System.out.print("Enter sample #" + (i-1) + ":");
			arr2[i] = input.nextInt();
			i++;
		}

		for ( i = 1; i<= Sample; i++) {
			avg2 = arr2[i] + avg2;
		}
		System.out.println(" ");
		System.out.println("Enter numbers for Trial 2");
		for (i = 1;i <= Sample;) {
			System.out.print("Enter sample #" + (i-1) + ":");
			arr3[i] = input.nextInt();
			i++;
		}
		for ( i = 1; i<= Sample; i++) {
			avg3 = arr3[i] + avg3;
		}

		System.out.println(" ");
		System.out.println("Enter numbers for Trial 3");
		for (i = 1;i <= Sample;) {
			System.out.print("Enter sample #" + (i-1) + ":");
			arr4[i] = input.nextInt();
			i++;
		}
		for ( i = 1; i<= Sample; i++) {
			avg4 = arr4[i] + avg4;
		}

		System.out.println( "	Sample #	Trial 1		Trial 2		Trial 3		Trial 4");

		for  (i = 0; i < Sample; ) {
			System.out.println("	" + i + "		" + arr1[i+1] + "		" + arr2[i+1] + "		" + arr3[i+1] + "		" + arr4[i+1] );
			i++;
			if (i == Sample){
				System.out.println("	-----------------------------------------------------------------------");
				System.out.println("Average:" + "                " + avg1/Sample +"		"  + avg2/Sample + "		" + avg3/Sample + "		" + avg4/Sample);

			}

		}

		System.out.println(" ");
		System.out.print("Min Average: ");
		if (avg1 <= avg2 & avg1 <= avg3 & avg1 <= avg4){
			System.out.println(avg1/Sample);
			min = avg1/Sample;
		}
		else if (avg2 <= avg1 & avg2 <= avg3 & avg2 <=avg4){
			System.out.println(avg2/Sample);
			min = avg2/Sample;
		}
		else if (avg3 <= avg1 & avg3 <= avg2 & avg3 <= avg4) {
			System.out.println(avg3/Sample);
			min = avg3/Sample;
		}
		else if (avg4 <= avg1 & avg4 <= avg2 & avg4 <= avg3) {
			System.out.println(avg4/Sample);
			min = avg4/Sample;
		}
		System.out.print("Max Average: ");
		if (avg1 >= avg2 & avg1 >= avg3 & avg1 >= avg4) {
			System.out.println(avg1/Sample);
			max = avg1/Sample;
		}
		else if (avg2 >= avg1 & avg2 >= avg3 & avg2 >= avg4){
			System.out.println(avg2/Sample);
			max = avg2/Sample;
		}
		else if (avg3 >= avg1 & avg3 >= avg2 & avg3 >= avg4) {
			System.out.println(avg3/Sample);
			max = avg3/Sample;
		}
		else if (avg4 >= avg1 & avg4 >= avg2 & avg4 >= avg3){
			System.out.println(avg4/Sample);
			max = avg4/Sample; 
		}

		System.out.println("");
		if (min == max) {
			System.out.println("The trials match EXACTLY!");
		}
		else if (2 * min < max){
			System.out.println("The trials do NOT concur!");
		}
		else if (2* min > max){
			System.out.println("The trials concur with each other!");
		}

	}


}
