package BST;

import Trees.TreeNode;

public class InorderSuccessor {

    public static int getSuccessor(TreeNode node, int target) {
        if (node == null)
            return Integer.MAX_VALUE;

        int left = getSuccessor(node.left, target);

        int right = getSuccessor(node.right, target);

        int result = Integer.MAX_VALUE;

        if (node.data > target && node.data < right) {
            result = node.data;
        }

        if (left > target && left < result) {
            result = left;
        }
        if (right > target && right < result) {
            result = right;
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root =new TreeNode(70);

        root.left =new TreeNode(20);
        root.right =new TreeNode(100);

        root.left.left =new TreeNode(10);
        root.left.right =new TreeNode(30);
        root.right.left =new TreeNode(80);
        root.right.right =new TreeNode(110);

        System.out.println("Successor : " + getSuccessor(root, 10) );
    }
}
