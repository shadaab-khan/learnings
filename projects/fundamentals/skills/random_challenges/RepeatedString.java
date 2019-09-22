package random_challenges;

import java.util.Scanner;

public class RepeatedString {

    private static long repeatedString(String s, long n) {

        long count=0;
        for(char c : s.toCharArray())
            if(c == 'a')
                count++;

        long factor = (n/s.length());
        long rem = (n%s.length());
        count =  factor*count  ;
        for(int i=0;i<rem;i++)
            if(s.charAt(i)=='a')
                count++;
        System.out.println(count);
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        String s = "aba";//scanner.nextLine();

//        long n = 1000000000000L;
        long n = 12;

        long result = repeatedString(s, n);

        System.out.println("Result is : "+result);
    }
}
