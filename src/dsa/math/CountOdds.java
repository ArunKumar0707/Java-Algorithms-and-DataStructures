package dsa.math;

public class CountOdds {
    //https://leetcode.com/problems/count-odd-numbers-in-an-interval-range
    static void main() {
        System.out.println(countOdds(3,7));
        System.out.println(countOdds(8,10));
    }
    public static int countOdds(int low, int high) {
        int n = (high - low + 1);
        boolean bothEven = false;
        if(low % 2 == 0 && high % 2 == 0) bothEven = true;
        return n % 2 == 0 ? n/2 : bothEven ? n/2 : n/2 + 1;
    }
}
