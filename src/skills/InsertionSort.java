package skills;

import java.util.Scanner;

public class InsertionSort {

    private void insertSort(int[] arr) {
        int i,j,key;
        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            for ( j = i-1; j >= 0 && arr[j]>key; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
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
        int i,n;
        System.out.println("Enter the length of the array");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Input array elements");
        for (i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.insertSort(arr);
        System.out.println("Sorted Array is :");
        insertionSort.printArray(arr);
    }
}
