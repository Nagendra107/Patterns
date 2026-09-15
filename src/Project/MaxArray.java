package Project;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
       Max();


    }
    static void Max()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
       int n=sc.nextInt();
        int max=0;
         int arr[] =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
