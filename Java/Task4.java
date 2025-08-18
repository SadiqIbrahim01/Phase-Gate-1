import java.util.Scanner;
public class Task4{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter an number to check if it is positive or not:");
	int number = input.nextInt();

	if (number > 0){
		System.out.println("It is positive.");
	}
	else {
		System.out.println("It is negative");
	}
  }
}