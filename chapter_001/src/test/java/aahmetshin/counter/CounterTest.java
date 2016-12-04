package aahmetshin.counter;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * @author aahmetshin
 * @version 1
 * @since 04.12.2016
 */
public class CounterTest {
	/**
	*Test class Counter.
	*/
	@Test
	public void whenTwoNumberThenSum() {
	final int check = 6;
	final int start = 1;
	final int finish = 5;
	Counter counter = new Counter();
	int result = counter.add(start, finish);
	assertThat(result, is(check));
	}
}