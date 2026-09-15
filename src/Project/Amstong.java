package Project;

import java.util.Scanner;

public class Amstong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     //   int n=sc.nextInt();
     //    boolean r=Amst(n);
       //  System.out.println(r);
        for(int i=100;i<=999;i++)
        {
            if(Amst(i))
            {
                System.out.println(i+" ");
            }
        }


    }
    static boolean  Amst(int n)
    {
        int o=n;
        int sum=0;
        while(n>0)
        {
            int re=n%10;
            sum=sum+re*re*re;
            n=n/10;

        }
        return sum==o;

    }
}
