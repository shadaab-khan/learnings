package random_challenges;

import java.io.*;
import java.util.Scanner;

public class CountingValleys {
    private static final Scanner scanner = new Scanner(System.in);
    private static int valley;

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        char[] steps = s.toCharArray();
        int d = 0;
        for (int i = 0; i < n; i++) {
            if (steps[i] == 'D' || steps[i] == 'd') {
                d--;
                if (d == -1) {
                    valley++;
                }
            }
            else d++;
        }
        return valley;
    }

    public static void main(String[] args) {
        int n = 10;//scanner.nextInt();
        String s = "dududududu";//scanner.nextLine();
        int result = countingValleys(n, s);
        System.out.println("No of Valleys : " + result);
        scanner.close();
    }
}
