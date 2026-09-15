package Pattern1;
import java.util.*;
public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n*(n+1)/2;
        for(int i=1;i<=n;i++)
        {

            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(c+" ");
                c--;
            }
            System.out.println();
        }
    }
}
