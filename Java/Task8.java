public class Task8{
public static void main(String[] args){
	System.out.println("Print sum of elements in an array");
	int[] numbers = {1, 2, 3, 4, 5};
	int sumOfElements = 0;
	for (int num = 0; num <= numbers.length; num++){
		sumOfElements += num;
	}
	System.out.println(sumOfElements);
  }
}