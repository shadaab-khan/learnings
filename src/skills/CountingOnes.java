package skills;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountingOnes {
    public static void main(String[] args) {
        List<Long> inputs = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total no. of test cases");
        int total = sc.nextInt();
        System.out.println("Enter the test cases");
        for (int n = 0; n < total; n++) {
            long num = getNextNum(sc);
            inputs.add(num);
        }
        inputs.forEach(in-> System.out.println("Count of odd numbers in sub strings: "+
                count(BigInteger.valueOf(in))));
    }

    private static long getNextNum(Scanner scanner) {
        Long l = scanner.nextLong();
        while(l > Math.pow(10,200)) {
                System.out.println("Exceeded number limit, enter new number");
            l = scanner.nextLong();
        }
        return l;
    }

    // method returns total number of
    // substring having odd ones

    static int count(BigInteger bigInteger) {
        int count = 0;
        String s = bigInteger.toString(2);

        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String test = s.substring(i, j).intern();
                if (!test.matches("^0*(?:10*10*)*$"))
                    count++;
            }
        }
        return count;
    }
}
