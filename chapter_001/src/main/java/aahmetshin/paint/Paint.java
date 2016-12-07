package aahmetshin.paint;

/**
* Class для рисования пирамиды.
* @author aahmetshin
* @since 07.12.2016
* @version 1
*/
public class Paint {
	/**
     *Piramid.
	 *@param h height
	 *@return sum
     */
	public String piramid(int h) {
	StringBuilder stringBuilder = new StringBuilder();
	for (int i = 1; i < h + 1; i++) {
            for (int j = 0; j < h - i; j++) {
                stringBuilder.append(" ");
            }
            stringBuilder.append("^");
            for (int k = 1; k < i; k++) {
                stringBuilder.append(" ^");
            }
            stringBuilder.append("\n\r");
        }
		return stringBuilder.toString();
	}
}