package random_challenges;

import java.util.Scanner;

public class StrLoop {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        String[] s = new String[N];
        for (int i = 0; i < N; i++) {
            s[i] = scanner.next();
        }
        for (int i = 0; i < s.length; i++) {
            StringBuilder strEven = new StringBuilder();
            StringBuilder strOdd = new StringBuilder();
            for (int j = 0; j < s[i].length(); j++) {
                if (j % 2 == 0) {
                    strEven.append(s[i].charAt(j));
                } else {
                    strOdd.append(s[i].charAt(j));
                }
            }
            System.out.println(strEven + " " + strOdd);
        }
    }
}
