package skills;

import java.util.Scanner;

public class SelectionSort {

    void sort(int[] arr){
        int i, j;
        int temp;
        for (i = 0; i < arr.length-1; i++) {
            int min_index = i;
            for (j = i+1; j < arr.length; j++) {
                    if(arr[j]<arr[min_index]){
                       min_index = j;
                    }
            }
            temp = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = temp;
        }
    }

    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    public static void main(String[] args) {
        int n, i;
        System.out.println("Enter the length of the array");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Input array elements");
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        SelectionSort ob = new SelectionSort();
        ob.sort(arr);
        System.out.println("Sorted Array is :");
        ob.printArray(arr);
    }
}
