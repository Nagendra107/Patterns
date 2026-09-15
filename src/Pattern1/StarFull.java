package Pattern1;
import java.util.Scanner;
public class StarFull {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < (2 * n) - 1; i++) {
            int stars;
            if (i < n) {
                stars = i + 1;
            } else {
                stars = (2 * n) - i-1;
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
