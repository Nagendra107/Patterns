package Pattern1;
import java.util.Scanner;
public class Patter11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=0;i<n;i++)
        {
            int starts;
            if(i%2==0)
            {
                starts=1;

            }
            else
            {
                starts=0;
            }
            for(int j=0;j<=i;j++) {


                System.out.print(starts);
                starts = 1 - starts;
            }
            System.out.println();

        }
    }
}
