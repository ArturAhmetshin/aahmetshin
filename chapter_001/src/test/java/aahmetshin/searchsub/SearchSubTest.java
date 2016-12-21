package aahmetshin.searchsub;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * @author aahmetshin
 * @version 1
 * @since 20.12.2016
 */
public class SearchSubTest {
	/**
	*Test class SearchSub. If String contains sub return true.
	*/
	@Test
	public void whenAddStringThenReturnTrue() {
	SearchSub searchsub = new SearchSub();
	final String origin = "Hello how are you";
	final String sub = "how";
	final boolean expect  = true;
	boolean result = searchsub.contains(origin, sub);
	assertThat(result, is(expect));
	}
	/**
	*Test class SearchSub. If String do not contains sub, return false.
	*/
	@Test
	public void whenAddStringThenReturnFalse() {
	SearchSub searchsub = new SearchSub();
	final String origin = "Hello how are you";
	final String sub = "howet";
	final boolean expect  = false;
	boolean result = searchsub.contains(origin, sub);
	assertThat(result, is(expect));
}
}