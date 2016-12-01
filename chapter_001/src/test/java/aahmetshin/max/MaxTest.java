package aahmetshin.max;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * @author aahmetshin
 * @version 1
 * @since 01.12.2016
 */
public class MaxTest {
	/**
     * MaxTest two numbers.
     */
	@Test
	public void whenTwoNumberThenMax() {
	final int check = 2;
	final int first = 2;
	final int second = 1;
	Max obj = new Max();
	int result = obj.max(first, second);
	assertThat(result, is(check));
	}
	/**
     * MaxTest three numbers.
     */
	@Test
	public void whenThreeNumberThenMax() {
	final int check = 3;
	final int first = 2;
	final int second = 1;
	final int third = 3;
	Max obj = new Max();
	int result = obj.max(first, second, third);
	assertThat(result, is(check));
	}
}