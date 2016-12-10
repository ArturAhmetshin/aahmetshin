package aahmetshin.sort;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * @author aahmetshin
 * @version 1
 * @since 04.12.2016
 */
public class SortArrayTest {
	/**
	*Test class SortArray.
	*/
	@Test
	public void whenAddArrayThenInvertedArray() {
	SortArray sort = new SortArray();
	final int[] srcArray = {4, 2, 3, 1};
	final int[] expectArray = {1, 2, 3, 4};
	int[] resultArray = sort.sort(srcArray);
	assertThat(resultArray, is(expectArray));
	}
}