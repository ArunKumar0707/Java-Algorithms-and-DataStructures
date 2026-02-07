package dsa.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    private static void helper(TreeNode root, List<Integer> list) {
        if (root != null) {
            helper(root.left, list);
            list.add(root.val);
            helper(root.right, list);
        }
    }

    public static void main(String[] args) {
        TreeNode root =
                new TreeNode(1,
                        null,
                        new TreeNode(2,
                                new TreeNode(3),
                                null));

        System.out.println(inorderTraversal(root)); // [1, 3, 2]
    }
}
