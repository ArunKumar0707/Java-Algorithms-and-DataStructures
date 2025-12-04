package dsa.search;

public class BinarySearch {
    static void main(String[] args) {
        int arr[] = {1, 22, 44, 55, 66, 77, 88, 99};
        int target = 88;
        System.out.println("index : " + binarySearch(arr, target));
    }

    private static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = start; i <= end; i++) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
