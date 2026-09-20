package BasicMaths;
import java.util.*;
public class CountingDigitsReturn {
    static int countDigits(int n)
    {
        int c=0;
        while(n!=0)
        {
            n=n/10;
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       int re= countDigits(n);
       System.out.println(re);
    }
}
