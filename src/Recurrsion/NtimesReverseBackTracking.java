package Recurrsion;
import java.util.*;
public class NtimesReverse {
    public static void printNumbers(int i,int n)
    {
        if(i<0)
            return ;
        printNumbers(i-1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNumbers(n,n);

    }
}
