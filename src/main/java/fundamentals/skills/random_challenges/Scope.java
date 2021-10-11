package fundamentals.skills.random_challenges;

import java.util.Scanner;

class Difference {
    private int[] elements;
    int maximumDifference;

    // Add your code here

    Difference(int[] a){
        this.elements = a;
    }

    void computeDifference(){
        int difference;
        for(int i=0;i<elements.length;i++){
            for (int j = i+1; j < elements.length; j++) {
                difference = Math.abs(elements[i]-elements[j]);
                if(maximumDifference<difference){
                    maximumDifference = difference;
                }
            }
        }
    }

}

public class Scope {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}
