package random_challenges;

import java.util.Scanner;

public class Loops {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a number");
        int n = scanner.nextInt();
        int i=1;
        if(n<2||n>20){
            System.out.println("Number out of max range.");
        }
        while ((i>0 && i<=10) && (n>1 && n<=20)){
            System.out.println(n+" * "+i+" = "+(n*i));
            i++;
        }
        scanner.close();
    }
}
