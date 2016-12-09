package aahmetshin.turn;

/**
* Class Turn.
* @author aahmetshin
* @since 09.12.2016
* @version 1
*/
public class Turn {
	/**
     *back.
	 *@param arr исходный массив
	 *@return array
     */
	 public int[] back(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int tmp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = tmp;
        }
		return arr;
    }
}