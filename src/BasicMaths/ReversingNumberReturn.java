package BasicMaths;
import java.util.*;
public class ReversingNumberReturn {
    static int ReverseDigit(int n) {
        int res = 0;
        while (n != 0) {
            int Digit = n % 10;
            res = res * 10 + Digit;
            n = n / 10;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int re = ReverseDigit(n);
        System.out.println(re);
    }
}

































