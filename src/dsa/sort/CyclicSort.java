package dsa.sort;

import java.util.Arrays;
// TC : O(N) worst case
// SC : O(1)

public class CyclicSort {
    static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        sort(arr);
        System.out.println("Sorted Array : "+Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
    }

    private static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
