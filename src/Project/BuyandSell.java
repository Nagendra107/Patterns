package Project;

import java.util.Scanner;

public class BuyandSell {
    public static void main(String[] args) {
Buy();
    }

    static void Buy() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int minPrice = arr[0];
        int maxprofit = 0;
        int profit = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < minPrice) {
                minPrice = arr[i];
            }
            profit = arr[i] - minPrice;
            if (profit > maxprofit)
                maxprofit = profit;
        }
        System.out.println(maxprofit);
    }
}

