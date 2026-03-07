package dsa.arrays;

public class ContainsNearbyDuplicate {

        public static boolean containsNearbyDuplicate(int[] nums, int k) {
            java.util.Set<Integer> set = new java.util.HashSet<>(k);

            for (int i = 0; i < nums.length; i++) {
                if (i > k) {
                    set.remove(nums[i - k - 1]);
                }

                if (!set.add(nums[i])) {
                    return true;
                }
            }

            return false;
        }

        public static void main(String[] args) {
            System.out.println(containsNearbyDuplicate(new int[]{1,2,3,1}, 3));
            System.out.println(containsNearbyDuplicate(new int[]{1,0,1,1}, 1));
        }
    }
