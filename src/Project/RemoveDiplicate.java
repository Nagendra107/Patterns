package Project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDiplicate {
    public static void main(String[] args) {
        dup();
    }

    static void dup() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        HashSet<Integer> cret = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            if (!cret.contains(arr.get(i))) {
                cret.add(arr.get(i));
                result.add(arr.get(i));
            }
        }
        System.out.println(result);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i) + " ");
        }

    }
}
