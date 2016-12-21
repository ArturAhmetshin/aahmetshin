package aahmetshin.searchsub;

/**
* Class SearchSub.
* @author aahmetshin
* @since 20.12.2016
* @version 1
*/
public class SearchSub {
	/**
     *contains.
	 *@param origin origin string
	 *@param sub sub string
	 *@return true if origin contains sub else false
     */
	 public boolean contains(String origin, String sub) {
        char[] intarray = origin.toCharArray();
		char[] defarray = sub.toCharArray();

        boolean found = false;
        boolean endReached = (defarray.length > intarray.length);
        int globalSearchIndex = 0;
        while (!(found || endReached)) {
            int localSearchIndex = 0;
            while (!found && (defarray[localSearchIndex] == intarray[globalSearchIndex + localSearchIndex])) {
                localSearchIndex++;
                found = (localSearchIndex == defarray.length);
            }
            globalSearchIndex++;
            endReached = (globalSearchIndex == (intarray.length - defarray.length + 1));
        }
  		return found;
    }
    }