package aahmetshin.max;

/**
* Class для вычисления максимального значения.
* @author aahmetshin
* @since 01.12.2016
* @version 1
*/
public class Max {
	/**
     *Max value.
	 *@param first первое число
	 *@param second второе число
	 *@return max value
     */
	public int max(int first, int second) {
	return first > second ? first : second;
	}
	/**
     *Max value.
	 *@param first первое число
	 *@param second второе число
	 *@param third третье число
	 *@return max value
     */
	public int max(int first, int second, int third) {
	return max(max(first, second), third);
	}
}