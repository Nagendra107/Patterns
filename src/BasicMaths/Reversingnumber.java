package BasicMaths;
import java.util.*;
public class Reversingnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=0;
        while(n!=0)
        {
            int digit=n%10;
            res=res*10+digit;
            n=n/10;
        }
        System.out.print(res);
    }
}
