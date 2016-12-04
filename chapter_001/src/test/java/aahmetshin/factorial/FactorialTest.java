package aahmetshin.factorial;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * @author aahmetshin
 * @version 1
 * @since 04.12.2016
 */
public class FactorialTest {
	/**
	*Test class Factorial.
	*/
	@Test
	public void whenArgumentThenFactorial() {
	final int check = 6;
	final int argument = 3;
	Factorial factorial = new Factorial();
	int result = factorial.fact(argument);
	assertThat(result, is(check));
	}
}