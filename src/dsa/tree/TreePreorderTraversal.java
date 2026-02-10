package dsa.tree;

import java.util.ArrayList;
import java.util.List;

public class TreePreorderTraversal {
    static class TreeNode {
        int val;
        BinaryTreeInorderTraversal.TreeNode left;
        BinaryTreeInorderTraversal.TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, BinaryTreeInorderTraversal.TreeNode left, BinaryTreeInorderTraversal.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static List<Integer> inorderTraversal(BinaryTreeInorderTraversal.TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        return list;
    }

    private static void helper(BinaryTreeInorderTraversal.TreeNode root, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            helper(root.left, list);
            helper(root.right, list);
        }
    }

    public static void main(String[] args) {
        BinaryTreeInorderTraversal.TreeNode root =
                new BinaryTreeInorderTraversal.TreeNode(1,
                        null,
                        new BinaryTreeInorderTraversal.TreeNode(2,
                                new BinaryTreeInorderTraversal.TreeNode(3),
                                null));

        System.out.println(inorderTraversal(root)); // [1, 3, 2]
    }
}

