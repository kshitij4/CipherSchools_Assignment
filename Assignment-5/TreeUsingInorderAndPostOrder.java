package Trees;

public class TreeUsingInorderAndPostOrder {

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, inorder.length-1, 0, postorder, postorder.length-1);
    }

    public static TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder,int postStart)
    {
        if (postStart < 0 || inStart < inEnd)
            return null;

        TreeNode root = new TreeNode(postorder[postStart]);

        int rIndex = inStart;
        for (int i = inStart; i >= inEnd; i--) {
            if (inorder[i] == postorder[postStart]) {
                rIndex = i;
                break;
            }
        }

        root.right = buildTree(inorder, inStart, rIndex + 1, postorder, postStart-1);
        root.left = buildTree(inorder, rIndex - 1, inEnd, postorder, postStart - (inStart - rIndex) -1);

        return root;
    }

    public static void main(String[] args) {

        int[] inorder = new int[] { 4, 8, 2, 5, 1, 6, 3, 7 };
        int[] postorder = new int[] { 8, 4, 5, 2, 6, 7, 3, 1 };

        TreeNode node = buildTree(inorder,postorder);

        TreeTraversals.levelOrder(node);
    }
}
