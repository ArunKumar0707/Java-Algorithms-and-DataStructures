package dsa.arrays;

public class RecoverOrder {

    public static int[] recoverOrder(int[] order, int[] friends) {
        int[] output = new int[friends.length];
        int i = 0;
        boolean[] present = new boolean[order.length + 1];
        for (int f : friends) {
            present[f] = true;
        }
        for (int o : order) {
            if (present[o]) output[i++] = o;
        }
        return output;
    }

    public static void main(String[] args) {
        int[] order1 = {1, 2, 3, 4};
        int[] friends1 = {2, 4};
        print(recoverOrder(order1, friends1));

        int[] order2 = {5, 3, 1, 2, 4};
        int[] friends2 = {1, 4, 5};
        print(recoverOrder(order2, friends2));
    }

    private static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}

