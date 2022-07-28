package warmup_1;

public class Max1020 {

    /**
     * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.
     */

    public int max1020(int a, int b) {

        int result = 0;

        if (((a < 10) || (a > 20)) && ((b < 10) || (b > 20))) {
            return result;
        } else if (((a >= 10) && (a <= 20)) && ((b < 10) || (b > 20))) {
            return result + a;
        } else if (((a < 10) || (a > 20)) && ((b >= 10) || (b <= 20))) {
            return result + b;
        } else if (((a >= 10) || (a <= 20)) && ((b >= 10) || (b <= 20))) {
            if (a > b) {
                return result + a;
            } else if (b > a) {
                return result + b;
            }
        }

        return result;
    }
}
