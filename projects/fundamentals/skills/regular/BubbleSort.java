package regular;

import java.util.Scanner;

public class BubbleSort {

    public void bubblesrt(int[] arr){
        int i, j;
        int temp;
        for (i = 0; i < arr.length-1; i++) {
            for (j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
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
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubblesrt(arr);
        System.out.println("Sorted Array is :");
        bubbleSort.printArray(arr);
    }

    public int bubblesrt(int[] a, int count) {
        int i, j;
        int temp;
        for (i = 0; i < a.length-1; i++) {
            for (j = i+1; j < a.length; j++) {
                if(a[j]<a[i]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    count++;
                }
            }
        }
        return count;
    }
}
