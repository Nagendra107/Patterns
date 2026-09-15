package Project;

import java.util.Scanner;

public class EvenOddFunction {
    public static void main(String[] args) {

        if(Even(30)) {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }

    }
    static boolean Even(int n)
    {
        Scanner input = new Scanner(System.in);
        n=input.nextInt();
        return (n&1)==0;
    }
}
