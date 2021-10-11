package random_challenges;

import java.util.Scanner;

interface AdvancedArithmetic{
    int divisorSum(int n);
}

class Divisor implements AdvancedArithmetic {
    public int divisorSum(int n) {
//        int divisor = n, sum=0;
//        while(divisor>0){
//            if(n%divisor==0){
//                sum+=divisor;
//            }
//            divisor--;
//        }
//        return sum;

//      ANOTHER WAY OF DOING
//        int sum = n;
//        for (int i = 1, half = n/2; i <= half; i++) {
//            if (n % i == 0) sum += i;
//        }
//        return sum;

//      ONE MORE WAY TO DO
        int sum=0;
        for (int i=1;i<=n;sum+=(n%i++==0?i-1:0));
//        for (int i=1;i<=n;sum+=(n%i==0?i:0),i++);
        return sum;
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Divisor();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
        System.out.println(sum);
    }
}
