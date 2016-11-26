package aahmetshin.calculator;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 * @author aahmetshin
 * @version 1
 * @since 25.11.2016
 */
public class CalculatorTest {
	/**
     * CalculatorTest.
	 *Summa
     */
	@Test
	public void whenAddThenSumma() {
	final double first = 1d;
	final double second = 1d;
	final double add = 2d;
	Calculator calc = new Calculator();
	calc.add(first, second);
	double result = calc.getResult();
	assertThat(result, is(add));
	}
	/**
     * CalculatorTest.
	 *Raznost
     */
	@Test
	public void whenSubThenRaznost() {
	final double first = 5d;
	final double second = 2d;
	final double sub = 3d;
	Calculator calc = new Calculator();
	calc.sub(first, second);
	double result = calc.getResult();
	assertThat(result, is(sub));
	}
	/**
     * CalculatorTest.
	 *Delenie
     */
	@Test
	public void whenDivThenDelenie() {
	final double first = 6d;
	final double second = 2d;
	final double div = 3d;
	Calculator calc = new Calculator();
	calc.div(first, second);
	double result = calc.getResult();
	assertThat(result, is(div));
	}
	/**
     * CalculatorTest.
	 *Umnogenie
     */
	@Test
	public void whenMultThenUmnogenie() {
	final double first = 4d;
	final double second = 2d;
	final double mult = 8d;
	Calculator calc = new Calculator();
	calc.mult(first, second);
	double result = calc.getResult();
	assertThat(result, is(mult));
	}
}