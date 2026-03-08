package dsa.arrays;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int max = 0;
        java.util.Map<Integer, Integer> map = new java.util.HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (map.get(num) > nums.length / 2) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }
}
