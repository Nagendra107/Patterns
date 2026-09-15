package Project;

import java.util.Scanner;

public class MaxandMin {
    public static void main(String[] args) {
        Min();

    }
    static void Min()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no numbers: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();

        }
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<n;i++) {
            if (arr[i] < min) {
                min = arr[i];


            } else {
                max = arr[i];

            }
        }
            System.out.println(min+" ");
            System.out.println(max+"");
        }

    }

