package random_challenges;

import java.util.Arrays;

public class BinaryNumbers {
    public static void main(String[] args) {
        int n = 999;
//        int rem=0,s=0,t=0;
//        while(n>0)
//        {
//            rem=n%2;
//            n=n/2;
//            if(rem==1)
//            {   s++;
//                if(s>=t)
//
//                    t=s;
//
//            }
//            else{
//
//                s=0;
//            }
//        }
//
//        System.out.println(t);

        String bin[] = Integer.toBinaryString(n).split("0+");
        Arrays.sort(bin);
        System.out.println(bin[bin.length-1].length());
    }
}
