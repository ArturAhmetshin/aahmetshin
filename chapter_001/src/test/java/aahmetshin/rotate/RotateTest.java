package aahmetshin.rotate;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * @author aahmetshin
 * @version 1
 * @since 10.12.2016
 */
public class RotateTest {
	/**
	*Test class Rotate.
	*/
	@Test
	public void whenAddArrayThenRotatedArray() {
	Rotate rotate = new Rotate();
	final int[][] srcArray = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
	final int[][] expectArray = {{2, 5, 8}, {1, 4, 7}, {0, 3, 6}};
	int[][] resultArray = rotate.rotate(srcArray);
	assertThat(resultArray, is(expectArray));
	}
}