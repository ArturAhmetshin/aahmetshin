package aahmetshin.calculator;

/**
* Class для вычисления арифметических операций + - * /.
* @author aahmetshin
* @since 23.11.2016
* @version 1
*/
public class Calculator {
	/**
     * Calculator.
     */
	private double result;
	/**
     * CalculatorTest.
	 *@param first первое число
	 *@param second второе число
     */
	public void add(double first, double second) {
	this.result = first + second;
	}
	/**
     * CalculatorTest.
	 *@param first первое число
	 *@param second второе число
     */
	public void sub(double first, double second) {
	this.result = first - second;
	}
	/**
     * CalculatorTest.
	 *@param first первое число
	 *@param second второе число
     */
	public void div(double first, double second) {
	this.result = first / second;
	}
	/**
     * CalculatorTest.
	 *@param first первое число
	 *@param second второе число
     */
	public void mult(double first, double second) {
	this.result = first * second;
	}
	/**
     * CalculatorTest.
	 *@return double result
     */
	public double getResult() {
	return this.result;
	}
}