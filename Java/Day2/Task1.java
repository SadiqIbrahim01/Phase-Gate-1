import java.util.Scanner;
public class Task1{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
		System.out.print("Current father's age: ");
		int fatherAge = input.nextInt();

		System.out.print("Current son's age: ");
		int sonAge = input.nextInt();

		int result = checkAge(fatherAge, sonAge);
		System.out.println("Father age will be twice of son age in " + result + " years");;
	}

	public static int checkAge(int fatherAge, int sonAge){
		int yearCount = 0;
		for (int age = 0; age < fatherAge; age++){
			if (fatherAge == age * 2){
				yearCount += age;
			}
		}
		return yearCount;
		
	}

}