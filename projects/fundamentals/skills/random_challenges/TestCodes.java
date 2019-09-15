package random_challenges;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class TestCodes {

        public static void main(String[] args) {
            int i = 4;
            double d = 4.0;
            String s = "HackerRank ";

            Scanner scan = new Scanner(System.in);
            /* Declare second integer, double, and String variables. */
            int intVal = 0;
            double doubleVal = 0;
            String str;
            /* Read and save an integer, double, and String to your variables.*/
            // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
            intVal = scan.nextInt();
            doubleVal = BigDecimal.valueOf(scan.nextDouble()).setScale(1, RoundingMode.HALF_UP).doubleValue();
            str = scan.next()+scan.nextLine();
            /* Print the sum of both integer variables on a new line. */
            intVal+= i;
            System.out.println(intVal);
            /* Print the sum of the double variables on a new line. */
            doubleVal+= d;
            System.out.println(doubleVal);
        /* Concatenate and print the String variables on a new line;
        	the 's' variable above should be printed first. */
            s+=str;
            System.out.println(s);
            scan.close();
        }
}
