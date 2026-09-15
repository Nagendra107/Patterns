package Project;

import java.util.Scanner;

public class SumOFAraay {
    public static void main(String[] args) {
    SumofArray();
    }

    static void SumofArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                sum = sum + a[i];
            }
        }
        System.out.println(sum);
    }
}
