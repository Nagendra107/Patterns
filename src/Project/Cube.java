package Project;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        for (int i = n; i <= m; i++) {
            sum = sum + (i * i * i);
        }
        System.out.println(sum);
    }
}
