package aahmetshin.triangle;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
* Class Test.
* @author aahmetshin
* @since 27.11.2016
* @version 1
*/
public class PointTest {
	/**
     * PointTest.
     */
	@Test
	public void whenTwoPointThenDistance() {
	Point one = new Point(0d, 1d);
	Point two = new Point(0d, 0d);
	final double dis = 1d;
	double result = one.distanceTo(two);
	assertThat(result, is(dis));
	}
}

