package aahmetshin.factorial;

/**
* Class для подсчета factorial.
* @author aahmetshin
* @since 04.12.2016
* @version 1
*/
public class Factorial {
	/**
     *Factorial.
	 *@param argument for for factorial
	 *@return result
     */
	public int fact(int argument) {
	int result = 1;
	for (int i = 2; i <= argument; i++) {
	result *= i;
	}
	return result;
	}
}