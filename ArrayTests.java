import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}

  @Test
  public void testReverseInPlace2() {
    int[] input = {1,2,3,4,5,6};
    ArrayExamples.reverseInPlace(input);
    System.out.println(input);
    assertArrayEquals(new int[]{6,5,4,3,2,1}, input);
  }

  @Test
  public void testReversed2(){
    int[] input = {0,1,2,3};
    System.out.println(ArrayExamples.reversed(input));
    assertArrayEquals(new int[]{3,2,1,0}, ArrayExamples.reversed(input));
  }


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }
}
