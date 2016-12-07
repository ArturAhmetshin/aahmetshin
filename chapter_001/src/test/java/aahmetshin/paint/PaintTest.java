package aahmetshin.paint;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * @author aahmetshin
 * @version 1
 * @since 07.12.2016
 */
public class PaintTest {
	/**
	*Test class Paint.
	*/
	@Test
	public void whenHeightThenPiramid() {
	final String check = " ^\n\r^ ^\n\r";
	final int height = 2;
	Paint paint = new Paint();
	String result = paint.piramid(height);
	assertThat(result, is(check));
	}
}