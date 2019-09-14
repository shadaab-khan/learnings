package random_challenges;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PairOfSocks {


    private static final Scanner scanner = new Scanner(System.in);
    private static int count;

    // Complete the sockMerchant function below.
    private static int sockMerchant(int n, int[] ar) {
        int[] freq = new int[ar.length];
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(ar[i]==ar[j]){
                    freq[i]++;
                    ar[j] = 0;
                }
            }
        }
        for (int i : freq) {
            if(freq[i]==2){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws IOException {

//        System.out.println("Enter the size of the array");
//        int n = scanner.nextInt();
        int[] ar = {10,20,20,10,10,30,50,10,20};

//        for (int i = 0; i < n; i++) {
//            int arItem = scanner.nextInt();
//            ar[i] = arItem;
//        }

        int result = sockMerchant(9, ar);
        System.out.println("The total no of pairs of socks : "+result);
        scanner.close();
    }
}
