public class Task10{
public static void main(String[] args){
	System.out.println("Print sum of elements in an array");
	int[] numbers = {1, 2, 3, 4, 5};
	int max = numbers[1];
	int min = numbers[1];
	for (int num = 0; num < numbers.length; num++){
		if (numbers[num] > max){
			max = numbers[num];
		}
		if (numbers[num] < min){
			min = numbers[num];
		}
	}
	System.out.println("Maximum is " + max);
	System.out.println("Minimum is " + min);
  }
}