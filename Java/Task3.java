import java.util.Scanner;
public class Task3{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter an integer to check if it is divisible by three or not: ");
	int number = input.nextInt();

	if (number % 3 == 0){
		System.out.println("It is divisible by three.");
	}
	else {
		System.out.println("It is not divisible by three.");
	}
  }
}