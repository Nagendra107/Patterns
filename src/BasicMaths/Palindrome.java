package BasicMaths;
import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int ord = n;
        int res = 0;
        while (n != 0) {
            int digit = n % 10;
            res = res * 10 + digit;
            n = n / 10;
        }
        if (ord ==res)
            System.out.print("True");
        System.out.print("False");

    }
}




































