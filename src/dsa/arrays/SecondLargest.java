package dsa.arrays;

public class SecondLargest {
    static void main() {
        int[] arr = {1, 19, 34, 54, 55, 66};
        System.out.println("the second largest element for 1st testcase is : " + findSecondLargest(arr));
        arr = new int[]{10, 5, 10};
        System.out.println("the second largest element for 2nd testcase is : " + findSecondLargest(arr));
        arr = new int[]{10, 10, 10};
        System.out.println("the second largest element for 3rd testcase is : " + findSecondLargest(arr));
        arr = new int[]{5, 8, 2};
        System.out.println("the second largest element for 4th testcase is : " + findSecondLargest(arr));
    }

    private static int findSecondLargest(int[] arr) {
        int prev = -1;
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                prev = max;
                max = arr[i];
            } else if (max > arr[i] && arr[i] > prev) {
                prev = arr[i];
            }
        }
        return prev;
    }
}
