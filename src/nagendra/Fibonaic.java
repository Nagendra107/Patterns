package nagendra;

import java.util.Scanner;

public class Fibonaic {
    public static void main(String[] rgs) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int b = 0;
        int c = 1;
        int count = 2;
        while (count <= n) {
            int t = c;
            c =  c+b;
            b= t;
            count++;
        }
        System.out.println(c);
    }
}