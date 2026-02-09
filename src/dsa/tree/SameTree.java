package dsa.tree;

public class SameTree {

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

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        boolean[] ans = new boolean[]{true};
        helper(p, q, ans);
        return ans[0];
    }

    private static void helper(TreeNode p, TreeNode q, boolean[] ans) {
        if (p == null || q == null) {
            if (!(p == null && q == null)) {
                ans[0] = false;
                return;
            }
            return;
        }

        if (p.val != q.val) {
            ans[0] = false;
            return;
        }

        helper(p.left, q.left, ans);
        helper(p.right, q.right, ans);
    }

    public static void main(String[] args) {
        TreeNode t1 =
                new TreeNode(1,
                        new TreeNode(2),
                        new TreeNode(3));

        TreeNode t2 =
                new TreeNode(1,
                        new TreeNode(2),
                        new TreeNode(3));

        TreeNode t3 =
                new TreeNode(1,
                        new TreeNode(2),
                        null);

        System.out.println(isSameTree(t1, t2)); // true
        System.out.println(isSameTree(t1, t3)); // false
    }
}
