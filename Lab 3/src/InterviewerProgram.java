import java.util.Scanner;
public class InterviewerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
String name;
System.out.println("What's your name my friend?");
name=input.next();

String major;
System.out.println("What is your major, if you dont mind me asking?");
major=input.next();

String Location;
System.out.println("Where do you live?");
Location=input.next();

String popular;
System.out.println("Are you popular?");
popular=input.next();

String integer;
System.out.println("What is your age?in interger form");
integer=input.next();


System.out.println("How much do you weigh in lb? I won't judge but I'll convert it to kg for you.");
int n1;
int weight; 
short n2;
n2 = (short)(2.2);
n1 = input.nextInt();
weight = (short)(n1/n2);


System.out.print("His name is ");
System.out.print(name + ".");
System.out.print(major);
System.out.print(" is his/her's major.");
System.out.print(Location);
System.out.print(" is where he lives.");
System.out.print(popular);
System.out.print(" is how popular he thinks he is." );
System.out.print("Wow "+integer+"!");
System.out.print("is his how old she/he is." );
System.out.print("His weight is about " + weight + "kg.");
	}

}
