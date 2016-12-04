package aahmetshin.counter;

/**
* Class для подсчета суммы в диапазоне.
* @author aahmetshin
* @since 04.12.2016
* @version 1
*/
public class Counter {
	/**
	* variable sum.
	*/
	private int sum = 0;
	/**
     *Sum.
	 *@param start первое число
	 *@param finish второе число
	 *@return sum
     */
	public int add(int start, int finish) {
	for (int i = start; i <= finish; i++) {
	if (i % 2 == 0) {
	sum = sum + i;
	}
	}
	return sum;
	}
}