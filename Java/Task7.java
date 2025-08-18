public class Task7{
public static void main(String[] args){
	System.out.println("Print smallest element in an array");
	int[] numbers = {3, 7, 2, 12, 15, 11, 9, 8, 4};
	int min = numbers[1];
	for (int num = 0; num < numbers.length; num++){
		if (numbers[num] < min){
			min = numbers[num];
		}
	}
	System.out.println(min);
  }
}