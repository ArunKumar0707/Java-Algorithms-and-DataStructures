package dsa.arrays;

public class SortPeople {
    // https://leetcode.com/problems/sort-the-people/
    // Topic : Array , Hash Table , String , Sorting
    public static String[] sortPeople(String[] names, int[] heights) {
        //    String[] sb = new String[heights.length];
        //     TreeMap<Integer,String> map = new TreeMap(Collections.reverseOrder());
        //     int i = 0;
        //     while(i < names.length){
        //         map.put(heights[i],names[i]);
        //         i++;
        //     }
        //     i=0;
        //     for(Map.Entry<Integer,String> entry : map.entrySet() ){
        //         sb[i] = entry.getValue();
        //         i++;
        //     }
        //     return sb;
        String[] s = new String[100001];
        String[] output = new String[heights.length];
        int j = 0;
        for (int i = 0; i < s.length; i++) {
            if (j < heights.length) {
                s[heights[j]] = names[j];
                j++;
            }
        }
        j = 0;
        for (int i = s.length - 1; i > 0; i--) {
            if ((s[i] != null) && (j < output.length)) {
                output[j] = s[i];
                j++;
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String[] names1 = {"Mary", "John", "Emma"};
        int[] heights1 = {180, 165, 170};
        print(sortPeople(names1, heights1));

        String[] names2 = {"Alice", "Bob"};
        int[] heights2 = {155, 190};
        print(sortPeople(names2, heights2));
    }

    private static void print(String[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
