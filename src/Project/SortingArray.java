package Project;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        sort();
    }

    static void sort() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Sorted array: " + arr[i]+ ", ");
        }
    }
}


