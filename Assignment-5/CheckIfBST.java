package Trees;

import java.util.Stack;

public class CheckIfBST {

    public static boolean isValidBST (TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = root ;
        TreeNode pre = null ;
        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left ;
            } else {
                TreeNode p = stack.pop() ;
                if (pre != null && p.data <= pre.data) {
                    return false ;
                }
                pre = p ;
                cur = p.right ;
            }
        }
        return true ;
    }

    public static void main(String[] args) {
        TreeNode root =new TreeNode(70);

        root.left =new TreeNode(20);
        root.right =new TreeNode(100);

        root.left.left =new TreeNode(10);
        root.left.right =new TreeNode(30);
        root.right.left =new TreeNode(80);
        root.right.right =new TreeNode(110);

        System.out.println(isValidBST(root));
    }
}