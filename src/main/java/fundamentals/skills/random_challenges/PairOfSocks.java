package random_challenges;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class PairOfSocks {


    private static final Scanner scanner = new Scanner(System.in);
    private static int pairs;

    // Complete the sockMerchant function below.
    private static int sockMerchant(int n, int[] ar) {
        int[] freq = new int[ar.length];
        for (int i = 0; i < n; i++) {
//          In order to count the current element set freq[i]=1
            freq[i]=1;
            for (int j = i+1; j < n; j++) {
                if(ar[i]==ar[j] && ar[i]!=0){
                    freq[i]++;
                    ar[j] = 0;
                }
            }
            for (int j = 1; j <=freq[i]; j++) {
                if (j % 2 == 0) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the size of the array");
        int n = scanner.nextInt();
        int[] ar = new int[n];//{10,20,20,10,10,30,50,10,20};

        for (int i = 0; i < n; i++) {
            int arItem = scanner.nextInt();
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);
        System.out.println("The total no of pairs of socks : "+result);
        scanner.close();
    }
}
