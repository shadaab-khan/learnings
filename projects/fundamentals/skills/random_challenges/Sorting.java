package random_challenges;

import regular.BubbleSort;

import java.util.Scanner;

public class Sorting {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        // Write Your Code Here
        BubbleSort bubbleSort = new BubbleSort();
        int count=0;
        int swaps = bubbleSort.bubblesrt(a, count);
        System.out.println("Array is sorted in "+swaps+" swaps");
        System.out.println("First Element: "+a[0]);
        System.out.println("Last Element: "+a[n-1]);
    }

}
