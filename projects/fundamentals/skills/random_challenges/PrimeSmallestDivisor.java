package random_challenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeSmallestDivisor {

    private static int isPrime(long n){
        int dividend = (int) n;
        for (int i = 2; i < dividend; i++) {
            if(dividend%i==0){
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) throws IOException {
        System.out.println("Enter a Number");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(bufferedReader.readLine());
        int psd = PrimeSmallestDivisor.isPrime(n);
        System.out.println("The smallest divisor of "+ n +" is : "+ psd);
    }
}
