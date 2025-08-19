import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task1Test{

@Test
	public void testToCheckCorrectResult(){
		int sonAge = 0;
		int fatherAge = 30;

		Age age = new Age();
		result = age.FatherAndSonAge(sonAge);

		assertEquals(result, 15);
	}

}