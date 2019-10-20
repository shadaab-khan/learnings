package random_challenges;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class TestCodes {

//        public static void main(String[] args) {
//            int i = 4;
//            double d = 4.0;
//            String s = "HackerRank ";
//
//            Scanner scan = new Scanner(System.in);
//            /* Declare second integer, double, and String variables. */
//            int intVal = 0;
//            double doubleVal = 0;
//            String str;
//            /* Read and save an integer, double, and String to your variables.*/
//            // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
//            intVal = scan.nextInt();
//            doubleVal = BigDecimal.valueOf(scan.nextDouble()).setScale(1, RoundingMode.HALF_UP).doubleValue();
//            str = scan.next()+scan.nextLine();
//            /* Print the sum of both integer variables on a new line. */
//            intVal+= i;
//            System.out.println(intVal);
//            /* Print the sum of the double variables on a new line. */
//            doubleVal+= d;
//            System.out.println(doubleVal);
//        /* Concatenate and print the String variables on a new line;
//        	the 's' variable above should be printed first. */
//            s+=str;
//            System.out.println(s);
//            scan.close();
//        }
//public static void main(String[] args) {
////    final int[] arr = {1,2,3};
////    final String[] arr = {"Hello","Hacker"};
////    System.out.println(arr[0] + " " + arr[1]);
////    arr[0] = "Dude";
////    System.out.println(arr[0] + " " + arr[1]);
//    Scanner in = new Scanner(System.in);
//    int n = 3, j=0;
//    Map<String, Integer> map = new HashMap<>();
//    String[] query = {"sam","ed","jon"};
//    for(int i = 0; i < n; i++){
////        String name = in.next();
////        int phone = in.nextInt();
//        // Write code here
////        map.put(name, phone);
//        map.put("sam",99);
//        map.put("jon",88);
//        map.put("mat",66);
//    }
//    while(j<3){
////        String s = in.next();
//        // Write code here
//        if(map.containsKey(query[j])){
//            System.out.print(query[j]+" = "+map.get(query[j]));
//            System.out.println();
//        }
//        else {
//            System.out.println("Not found");
//        }
////        System.out.println();
//        j++;
//    }
//    in.close();
//}

    public static void main(String[] args) {
        int n=3, result;
        result = fact(n);
        System.out.println(result);

        final int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {10, 20, 30, 40, 50};
        arr2 = arr1;
//        arr1 = arr2; // cannot assign non-final array obj reference to final
        for (int value : arr2) System.out.println(value);
}

    private static int fact(int n) {
        if (n == 1)
            return 1;
        else
        return n * fact(n - 1);
    }
}
