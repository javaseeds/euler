package funk.shane.euler;

/**
 * Created by Shane on 12/31/2014.
 */
public class Problem1 {
    public int sum(int upper) {
        int x = 0;

        for(int i = 0; i < upper; i++) {
            if(i%3 == 0) {
                x += i;
            }
            else if (i%5 == 0) {
                x += i;
            }
        }

        return x;
    }

    public static void main(String[] args) {
        System.out.println(new Problem1().sum(1000));
    }
}
