import java.util.Scanner;
public class Manipulative {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n1,n2; 
	System.out.println("We will be taking 2 numbers to do the 5 operations on. ");
	System.out.println("Please enter the first number");
    n1 = input.nextInt(); 
System.out.println("Give us the second number.");
n2 = input.nextInt();
int addition;
addition = n1 + n2;
System.out.println("The addition of the 2 numbers are " + addition);
int subtract;
subtract = n1 - n2;
System.out.println("n1-n2 is " + subtract);
int multiply;
multiply = n1 * n2;
System.out.println("n1 * n2 is " + multiply);
int divide;
divide = n1 / n2;
System.out.println("n1 divided by n2 is " + divide);
int rem;
rem = n1 % n2;
System.out.println("n1 % n2 is " + rem);
System.out.println("Now we will show the results in the double data type format");
double d1,d2;
System.out.println("Please enter the first number");
d1 = input.nextDouble(); 
System.out.println("Give us the second number.");
d2 = input.nextDouble();


double add;
add = d1 + d2;
System.out.println("The addition of the 2 numbers are " + add);
double sub;
sub = d1 - d2;
System.out.println("n1-n2 is " + sub);
double mul;
mul = d1 * d2;
System.out.println("n1 * n2 is " + mul);
double div;
div = d1 / d2;
System.out.println("n1 divided by n2 is " + div);
double rema;
rema = d1 % d2;
System.out.println("n1 % n2 is " + rema);
System.out.println("Now we'll show it in the float data type format.");
float f1,f2;
System.out.println("Please enter the first number");
f1 = input.nextFloat(); 
System.out.println("Give us the second number.");
f2 = input.nextFloat();
float additio;
additio = f1 + f2;
System.out.println("The addition of the 2 numbers are " + additio);
float subtrac;
subtrac = f1 - f2;
System.out.println("n1-n2 is " + subtrac);
float multipl;
multipl = f1 * f2;
System.out.println("n1 * n2 is " + multipl);
float divid;
divid = f1 / f2;
System.out.println("n1 divided by n2 is " + divid);
float remai;
remai = f1 % f2;
System.out.println("n1 % n2 is " + remai);
System.out.println("We gon' be putting it in shorts now. ");
short s1,s2;
System.out.println("Please enter the first number");
s1 = input.nextShort(); 
System.out.println("Give us the second number.");
s2 = input.nextShort();
short addi;
addi =(short)(s1 + s2);
System.out.println("n1 + n2 is " + addi);
short subt;
subt = (short)(s1 - s2);
System.out.println("n1 - n2 is " + subt);
short mult;
mult = (short)(s1 * s2);
System.out.println("n1 * n2 is " + mult);
short divi;
divi = (short)(s1 / s2);
System.out.print("n1 / n2 is " + divi);
short remain;
remain = (short)(s1 % s2);
System.out.println("n1 % n2 is " + remain);

	}

}
