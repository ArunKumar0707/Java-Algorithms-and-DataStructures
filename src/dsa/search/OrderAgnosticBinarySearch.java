package dsa.search;

public class OrderAgnosticBinarySearch {
    static void main(String[] args) {
        int arr[] = {99, 87, 76, 54, 54, 45, 23, 21, 10, 5, 3, 0, -22, -100};
        int target = 23;
        System.out.println("index : " + orderAgnosticBinarySearch(arr, target));
    }

    private static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        for (int i = start; i <= end; i++) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) return mid;
            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
