package funk.shane.euler;

/**
 * Created by Shane on 12/31/2014.
 */
public class Problem2 {

    private long sum;

    public Problem2(int upper) {
        /* Initial conditions */
        long x = 1;
        long y = 2;
        long z = 0;
        sum = y;

        while(z <= upper) {
            z = x + y;
            x = y;
            y = z;

            if(z%2 == 0) {
                sum += z;
            }
        }
    }

    public long getSum() {
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Problem2(4_000_000).getSum());
    }
}
