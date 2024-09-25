
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        String result = arr[1];
        int max = arr[1].length();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].length()>max){
                result = arr[i];
                max = arr[i].length();
            }
        }
        return result;
    }
}
