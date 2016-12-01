package aahmetshin.triangle;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;
/**
* Class Test triangle.
* @author aahmetshin
* @since 28.11.2016
* @version 1
*/
public class TriangleTest {
	/**
     * variable var.
     */
	private final double var = 0.01;
	/**
     * TriangleTest.
     */
	@Test
	public void whenThreePointResultatArea() {
	Point pointA = new Point(0d, 0d);
	Point pointB = new Point(0d, 2d);
	Point pointC = new Point(2d, 0d);
	final double area = 2d;
	Triangle triangle = new Triangle(pointA, pointB, pointC);
	double result = triangle.area();
	assertThat(result, closeTo(area, var));
	}
	/**
     * TriangleTest.
     */
	@Test
	public void validTriangleTest() {
	Point pointA = new Point(0d, 0d);
	Point pointB = new Point(0d, 2d);
	Point pointC = new Point(0d, 1d);
	final double area = 0d;
	Triangle triangle = new Triangle(pointA, pointB, pointC);
	double result = triangle.area();
	assertThat(result, is(area));
}
}