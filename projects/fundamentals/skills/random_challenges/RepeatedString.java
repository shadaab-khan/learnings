package random_challenges;

import java.util.Scanner;

public class RepeatedString {

    private static long repeatedString(String s, long n) {

        char[] ch = s.toCharArray();
        StringBuilder newStr = new StringBuilder();
        long count=0;
        int k =0;
        for(int j=0;j<n;j++){
            if(k>s.length()-1) {
                k=0;
            }
            newStr.append(ch[k]);
                k++;
            if(newStr.charAt(j)=='a'){
                count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        String s = "a";//scanner.nextLine();

        long n = 1000000000000L;//scanner.nextLong();

        long result = repeatedString(s, n);

        System.out.println("Result is : "+result);
    }
}
