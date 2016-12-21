package aahmetshin.combine;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * @author aahmetshin
 * @version 1
 * @since 21.12.2016
 */
public class CombineTest {
	/**
	*Test class Combine.
	*/
	@Test
	public void whenAddTwoArrayThenCombinedArray() {
	Combine combine = new Combine();
	final int[] firstArray = {0, 1, 2};
	final int[] secondArray = {3, 5, 7};
	final int[] expectArray = {0, 1, 2, 3, 5, 7};
	int[] resultArray = combine.combine(firstArray, secondArray);
	assertThat(resultArray, is(expectArray));
	}
}