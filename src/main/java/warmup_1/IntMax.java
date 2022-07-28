package warmup_1;

public class IntMax {

    /**
     *
     Given three int values, a b c, return the largest.
     */

    public int intMax(int a, int b, int c) {

        int maxValue = 0;

        if ((a > b) && (a > c)) {
            maxValue = maxValue + a;
        } else if ((b > a) && (b > c)) {
            maxValue = maxValue + b;
        } else if ((c > a) && (c > b)) {
            maxValue = maxValue + c;
        }

        return maxValue;

    }

}
