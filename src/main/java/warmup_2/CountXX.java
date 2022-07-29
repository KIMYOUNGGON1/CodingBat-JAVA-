package warmup_2;

public class CountXX {

    /**
     * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".
     */

    int countXX(String str) {

        int result = 0;

        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                result++;
            }
        }

        return result;

    }



}
