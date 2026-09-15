package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class MoveZerotoend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());

        }
        ArrayList<Integer> nt = new ArrayList<>();
        int zerocount = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) != 0) {
                nt.add(arr.get(i));
            } else {
                zerocount++;
            }
        }
        for (int i = 0; i < zerocount; i++) {
            nt.add(0);}
            System.out.println(nt + " ");

    }
}


