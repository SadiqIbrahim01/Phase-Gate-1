import java.util.Scanner;
public class Task2{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Enter first score: ");
	int score1 = input.nextInt();
	System.out.println();

	System.out.println("Enter second score: ");
	int score2 = input.nextInt();
	System.out.println();

	System.out.println("Enter third score: ");
	int score3 = input.nextInt();
	System.out.println();

	double average = score1 + score2 + score3 / 3;
		if (average >= 90 && average <= 100){
			System.out.println("A");
		}
		else if (average >= 80 && average <= 89){
			System.out.println("B");
		}
		else if (average >= 70 && average <= 79){
			System.out.println("C");
		}
		else if (average >= 60 && average <= 69){
			System.out.println("D");
		}
		else {
			System.out.println("F");
		}
			
	
	}
}