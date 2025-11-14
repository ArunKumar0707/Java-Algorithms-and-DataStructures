package dsa.list;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedList {
    void main() {
        //1st test case
        List<Integer> list1 = List.of(1, 2, 4);
        List<Integer> list2 = List.of(1, 3, 4);
        System.out.println("1st test case output : " + merge(list1, list2));
        //2nd test case
        list1 = List.of();
        list2 = List.of();
        System.out.println("2nd test case output : " + merge(list1, list2));
        //3rd test case
        //list1 is already empty i.e []
        list2 = List.of(0);
        System.out.println("3rd test case output : " + merge(list1, list2));
        //4th test case
        list1 = List.of(77, 88, 99, 100, 193, 202);
        list2 = List.of(11, 33, 44, 55, 66, 77, 88, 100);
        System.out.println("4th test case output : " + merge(list1, list2));


    }

    // we are using two pointer approach to solve this problem
    // we are taking i and j where i will point the first list and j will point the second list
    // we will compare both the value of the list1 and list2 and will add the minimum to the
    // merged list .
    private List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        int i = 0, j = 0, size1 = list1.size(), size2 = list2.size();
        List<Integer> mergedList = new ArrayList<>();
        while (i < size1 && j < size2) {
            int val1 = list1.get(i);
            int val2 = list2.get(j);

            if (val1 < val2) {
                mergedList.add(val1);
                i++;
            } else {
                mergedList.add(val2);
                j++;
            }
        }
        // for remaining elements
        // in case list2 was exhausted
        while (i < size1) {
            mergedList.add(list1.get(i));
            i++;
        }
        // in case list1 was exhausted
        while (j < size2) {
            mergedList.add(list2.get(j));
            j++;
        }
        return mergedList;
    }
}
