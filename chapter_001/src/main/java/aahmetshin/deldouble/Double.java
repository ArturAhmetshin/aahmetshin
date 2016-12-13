package aahmetshin.deldouble;
import java.util.Arrays;
/**
* Class Double.
* @author aahmetshin
* @since 13.12.2016
* @version 1
*/
public class Double {
	/**
     *double.
	 *@param firstarray исходный массив
	 *@return second array
     */
	 public String[] deletedouble(String[] firstarray) {
        int length = firstarray.length;
		String[] secondarray = new String[length];
        int a = 0;
        int index = 0;
      for (int i = 0; i < length; i++) {
          a = 0;
          for (int j = 0; j < index; j++) {
            if (secondarray[j].equals(firstarray[i])) {
                a++;
            }
          }
              if (a == 0) {
                  secondarray[index++] = firstarray[i];
            }
        }
        secondarray = Arrays.copyOf(secondarray, index);
		return secondarray;
    }
}