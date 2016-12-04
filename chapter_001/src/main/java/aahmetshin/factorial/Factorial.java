package aahmetshin.factorial;

/**
* Class для подсчета factorial.
* @author aahmetshin
* @since 04.12.2016
* @version 1
*/
public class Factorial {
	/**
	* variable result.
	*/
	private int result = 1;
	/**
     *Factorial.
	 *@param argument for for factorial
	 *@return result
     */
	public int fact(int argument) {
	for (int i = 2; i <= argument; i++) {
	result *= i;
	}
	return result;
	}
}