package aahmetshin.deldouble;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * @author aahmetshin
 * @version 1
 * @since 13.12.2016
 */
public class DoubleTest {
	/**
	*Test class Double.
	*/
	@Test
	public void whenAddArrayThenReturnWhithoutDublicate() {
	Double doubl = new Double();
	final String[] srcArray = {"Привет", "Мир", "Привет", "Мир"};
	final String[] expectArray = {"Привет", "Мир"};
	String[] resultArray = doubl.deletedouble(srcArray);
	assertThat(resultArray, is(expectArray));
	}
}