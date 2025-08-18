import java.util.Scanner;
public class Task1{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter first integer: ");
	int number1 = input.nextInt();

	System.out.print("Enter second integer: ");
	int number2 = input.nextInt();
	System.out.println("");

	int square1 = number1 * number1;
	System.out.println("The square of the first number is " + square1);

	int square2 = number2 * number2;
	System.out.println("The square of the second number is " + square2);

	int sumOfSquares = square1 + square2;
	System.out.println("The sum of the squares is " + sumOfSquares);

	int differenceOfSquares = square1 - square2;
	System.out.println("The difference of the squares is " + differenceOfSquares);
  }

}