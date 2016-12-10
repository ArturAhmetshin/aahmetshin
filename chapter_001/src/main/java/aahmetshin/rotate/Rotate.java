package aahmetshin.rotate;

/**
* Class Rotate.
* @author aahmetshin
* @since 10.12.2016
* @version 1
*/
public class Rotate {
	/**
     *rotate.
	 *@param arr исходный массив
	 *@return rotate array
     */
	 public int[][] rotate(int[][] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
        for (int j = i; j < arr.length - 1 - i; j++) {
			int tmp = arr[i][j];
			arr[i][j] = arr[j][arr.length - 1 - i];
			arr[j][arr.length - 1 - i] = arr[arr.length - 1 - i][arr.length - 1 - j];
			arr[arr.length - 1 - i][arr.length - 1 - j] = arr[arr.length - 1 - j][i];
            arr[arr.length - 1 - j][i] = tmp;
   		}
        }
		return arr;
    }
}