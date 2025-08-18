public class Task6{
public static void main(String[] args){
	System.out.println("Print largest element in an array");
	int[] numbers = {3, 7, 2, 12, 15, 11, 9, 8};
	int max = numbers[1];
	for (int num = 0; num < numbers.length; num++){
		if (numbers[num] > max){
			max = numbers[num];
		}
	}
	System.out.println(max);
  }
}