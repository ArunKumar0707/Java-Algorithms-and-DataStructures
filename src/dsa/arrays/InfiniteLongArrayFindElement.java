package dsa.arrays;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

//we have to find the target element without using Array.length
public class InfiniteLongArrayFindElement {
    static void main(String[] args) {
        int[] infiniteArray = {
                1, 3, 5, 7, 9, 12, 15, 18, 22, 27,
                33, 40, 48, 57, 67, 78, 90, 103, 117,
                132, 148, 165, 183, 202, 222, 243,
                265, 288, 312, 337, 363, 390, 418,
                447, 477, 508, 540, 573, 607, 642,
                678, 715, 753, 792, 832, 873, 915,
                958, 1002, 1047, 1093, 1140, 1188,
                1237, 1287, 1338, 1390, 1443, 1497,
                1552, 1608, 1665, 1723, 1782, 1842,
                1903, 1965, 2028, 2092, 2157, 2223,
                2290, 2358, 2427, 2497, 2568, 2640,
                2713, 2787, 2862, 2938, 3015, 3093,
                3172, 3252, 3333, 3415, 3498, 3582
        };
        int target = 2427;
        System.out.println("The index of the element is : "+findPos(infiniteArray,target));
    }
    private static int findPos(int[] arr,int target){
        int start = 0;
        int end = 1;
        while (end < arr.length && target > arr[end]){
            int newStart = end;
            end = end + (end - start + 1) * 2; // doubling the window size
            start = newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    private static int binarySearch(int[] arr,int target,int start, int end){
        while(start <= end){
            int mid = (start + end) >>> 1;
            if(arr[mid] > target){
                end = mid - 1;
            } else if(arr[mid] < target){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }


}
