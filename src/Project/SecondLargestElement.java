package Project;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of numbers: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int fl = arr[0];
        int sl = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > fl) {
                sl = fl;
                fl = arr[i];
            } else if (arr[i] > sl && arr[i] != fl) {
                sl = arr[i];
            }
        }
        System.out.println(sl);

    }
}