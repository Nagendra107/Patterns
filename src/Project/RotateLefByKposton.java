package Project;

import java.util.Scanner;

public class RotateLefByKposton {
    public static void main(String[] args) {
 left();
    }
    static void left()
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        int k=sc.nextInt();


        int []arr1=new int[n];
        int index=0;
        for(int i=k;i<n;i++)
        {
            arr1[index]=arr[i];
            index++;

        }
        for(int i=0;i<k;i++)
        {
            arr1[index]=arr[i];
            index++;
        }
        for(int i=0;i<n;i++)
        {
            arr[i]=arr1[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }


    }
}
