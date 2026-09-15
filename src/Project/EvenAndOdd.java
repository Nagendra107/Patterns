package Project;

import java.util.Scanner;

public class EvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int n = sc.nextInt();
        int Evencount = 0;
        int Oddcount = 0;
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 == 0) {
                Evencount++;
            } else {
                Oddcount++;
            }
        }

            System.out.println("even numbers: " + Evencount);
            System.out.println("Odd Numbers: " + Oddcount);

    }
}


