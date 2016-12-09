package aahmetshin.turn;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * @author aahmetshin
 * @version 1
 * @since 04.12.2016
 */
public class TurnTest {
	/**
	*Test class Turn.
	*/
	@Test
	public void whenAddArrayThenInvertedArray() {
	Turn turn = new Turn();
	final int[] srcArray = {1, 2, 3, 4};
	final int[] expectArray = {4, 3, 2, 1};
	int[] resultArray = turn.back(srcArray);
	assertThat(resultArray, is(expectArray));
	}
}