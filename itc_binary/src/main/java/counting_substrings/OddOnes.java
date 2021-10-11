package counting_substrings;

import java.math.BigInteger;
import java.util.Scanner;

class OddOnes {

    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            System.out.println(count(sc.nextBigInteger()));
        }

    }

    static int count(BigInteger x) {
        int count = 0;
        String xx = x.toString(2);

        int n = xx.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String test = xx.substring(i, j).intern();
                if (!test.matches("^0*(?:10*10*)*$"))
                    count++;

            }
        }
        return count;
    }
}
