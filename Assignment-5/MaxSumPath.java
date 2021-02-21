package Trees;

public class MaxSumPath {
    static int max = Integer.MIN_VALUE;

    public static int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }

    static int helper(TreeNode root) {
        if (root == null) return 0;

        int left = Math.max(helper(root.left), 0);
        int right = Math.max(helper(root.right), 0);

        max = Math.max(max, root.data + left + right);

        return root.data + Math.max(left, right);
    }

    public static void main(String[] args) {
        TreeNode root =new TreeNode(10);

        root.left =new TreeNode(20);
        root.right =new TreeNode(-30);

        root.left.left =new TreeNode(40);
        root.left.right =new TreeNode(-50);
        root.right.left =new TreeNode(-60);
        root.right.right =new TreeNode(70);

        System.out.println(maxPathSum(root));
    }
}
