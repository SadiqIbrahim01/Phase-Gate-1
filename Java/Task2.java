import java.util.Scanner;
public class Task2{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter 3 integers: ");
	int number1 = input.nextInt();
	int number2 = input.nextInt();
	int number3 = input.nextInt();

	int sumOfIntegers = number1 + number2 + number3;
	System.out.println("Sum of integers is " + sumOfIntegers);

	int averageOfIntegers = sumOfIntegers / 3;
	System.out.println("Average of integers is " + averageOfIntegers);

	int productOfIntegers = number1 * number2 * number3;
	System.out.println("Product of integers is " + productOfIntegers);

	int max = number1;
	int min = number1;

	if (number2 > number1) max = number2;
	if (number3 > number1) max = number3;
	
	if (number2 < number1) min = number2;
	if (number3 < number1) min = number3;

	System.out.println("Largest is " + max);
	System.out.println("Smallest is " + min);
	
	
  

  }
}