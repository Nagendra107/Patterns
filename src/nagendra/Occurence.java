package nagendra;

import java.util.Scanner;

public class Occurence {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int r=0;
        int a=sc.nextInt();
        int count=0;
        while(a>0)
        {
            r=a%10;
            if(r==3)
            {
                count++;
            }

        a=a/10;}
        System.out.println(count);
    }
}
