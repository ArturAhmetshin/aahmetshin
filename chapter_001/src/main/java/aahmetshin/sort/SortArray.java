package aahmetshin.sort;

/**
* Class SortArray.
* @author aahmetshin
* @since 10.12.2016
* @version 1
*/
public class SortArray {
	/**
     *back.
	 *@param arr исходный массив
	 *@return array
     */
	 public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
			if (arr[j] > arr[j + 1]) {
			int tmp = arr[j];
			arr[j] = arr[j + 1];
            arr[j + 1] = tmp;
			}
   		}
        }
		return arr;
    }
}