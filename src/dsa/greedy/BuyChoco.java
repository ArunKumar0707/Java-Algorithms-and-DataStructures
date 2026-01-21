package dsa.greedy;

import java.util.*;

public class BuyChoco {

    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int balance = money - (prices[0] + prices[1]);
        return balance >= 0 ? balance : money;
    }

    public static void main(String[] args) {
        System.out.println(buyChoco(new int[]{1, 2, 2}, 3));
        System.out.println(buyChoco(new int[]{3, 2, 3}, 3));
    }
}

