package dsa.arrays;

import java.util.*;

public class SummaryRanges {

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        int j = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(i != nums.length-1) j = i+1;
            if(nums[j]-1 != nums[i] ) {
                list.add(nums[i]+"");
                continue;
            }
            while(j < nums.length && j > i){
                if(j != nums.length -1 && nums[j+1]-1 == nums[j]) {
                    j++;
                } else if(j == nums.length-1 && nums[j]+1 == nums[j-1]){
                    j++;
                }else{
                    list.add(nums[i]+"->"+nums[j]);
                    i=j;
                    break;
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int[] nums1 = {0,1,2,4,5,7};
        int[] nums2 = {0,2,3,4,6,8,9};

        System.out.println(summaryRanges(nums1)); // ["0->2","4->5","7"]
        System.out.println(summaryRanges(nums2)); // ["0","2->4","6","8->9"]
    }
}
