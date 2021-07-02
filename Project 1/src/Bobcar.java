import java.util.Scanner;
public class Bobcar {
	public static void main(String[] args){

		int numDays, carPrice, clubMember, Base, discount;
		double platPack,totEstimate;
		Scanner kbd = new Scanner(System.in);
		String carType = "null";
		platPack = 0;
		totEstimate = 0;
		System.out.println("Available cars: 1 for Economy, 2 for Compact, 3 for Standard");
		System.out.print("Please choose the rental car: ");
		carPrice = kbd.nextInt();
		if (carPrice == 1){
			carPrice = 35;
			carType = ("Economy ");
		}
		else if (carPrice == 2){
			carPrice = 45;
			carType = ("Compact ");
		}
		else if (carPrice == 3){
			carPrice = 95;
			carType = ("Standard ") ;
		}
		else {
			System.out.println("Car not available.");


		}

		System.out.print("Please enter the number of rental days: ");
		numDays = kbd.nextInt();
		System.out.print("Club member?: 1 for yes, 0 for no: ");
		clubMember = kbd.nextInt();
		Base = carPrice * numDays;
		if (clubMember == 1){
			System.out.print("Platinum Executive Package?: 1 for yes, 0 for no: ");
			platPack = kbd.nextInt();
		}


		System.out.println("Base: " + numDays + " days for a " + carType + "@ $" + carPrice + " per day: $" + Base );
		discount = ((numDays/7)*carPrice);
		if( clubMember == 0){
			System.out.println("Total Estimate for Rental: $" + Base);
		}
		if (clubMember == 1 && platPack == 0){
			System.out.println("Club Member Discount: - " + discount);
			totEstimate = (Base - discount);
			System.out.println("Total Estimate for Rental: $" + (int)totEstimate);
		}

		if (clubMember ==1 && platPack == 1){ 
			System.out.println("Club Member Discount: - $" + discount);
			platPack = Base * 0.15;
			if (platPack % 1 == 0){
				System.out.println("Platinum Executive Package: + $" + (int)platPack );
				totEstimate = (Base - discount + platPack);
				System.out.println("Total Estimate for Rental: $" + (int)totEstimate);
			}
			else if (platPack % 1 != 0){
				System.out.println("Platinum Executive Package: + $" + platPack );
				totEstimate = (Base - discount + platPack);
				System.out.println("Total Estimate for Rental: $" + totEstimate);
			}

		}
	}
}







