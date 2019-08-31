package skills;

import java.util.Scanner;

public class BinarySearch {

    static void binSort(int[] arr, int key) {

    }

    public static void main(String[] args) {
        int n = 0, key;
        int arr[] = new int[' '];
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the size of the array");
        n = scanner.nextInt();
        System.out.println("Enter the array values in a sorted order");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the element to find");
        key = scanner.nextInt();
        binSort(arr, key);
    }
}
