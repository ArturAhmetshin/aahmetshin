package aahmetshin.combine;

/**
* Class Combine.
* @author aahmetshin
* @since 21.12.2016
* @version 1
*/
public class Combine {
	/**
     *combine.
	 *@param firstarray first array
	 *@param secondarray second array
	 *@return combine array
     */
	 public int[] combine(int[] firstarray, int[] secondarray) {
        int n = firstarray.length;
        int m = secondarray.length;
		int i = 0, j = 0;
        int index = 0;
		int[] result = new int[n + m];
		while (i < n && j < m) {
            if (firstarray[i] < secondarray[j]) {
                result[index] = firstarray[i];
                i++;
            } else {
                result[index] = secondarray[j];
                j++;
            }
            index++;
        }
        while (i < n) {
            result[index] = firstarray[i];
            index++;
            i++;
        }
        while (j < m) {
            result[index] = secondarray[j];
            index++;
            j++;
        }
		return result;
    }
}