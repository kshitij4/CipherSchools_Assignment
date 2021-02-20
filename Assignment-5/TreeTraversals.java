package Trees;

import java.util.Stack;
public class TreeTraversals {

    public static void inorder(TreeNode root)
    {
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            System.out.print(node.data + "->");
            root = node.right;
        }
    }

    public static void preorder(TreeNode root){
        Stack<TreeNode> stack =new Stack<>();
        if(root == null)
            return;
        stack.push(root);
        while (!stack.isEmpty())
        {
            TreeNode node = stack.pop();
            System.out.print(node.data + "->");
            if(node.right!=null)
                stack.push(node.right);
            if(node.left != null)
                stack.push(node.left);
        }

    }

    public static void postorder(TreeNode root)
    {
        if(root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + "->");

    }


    public static void main(String[] args) {

        TreeNode root =new TreeNode(10);

        root.left =new TreeNode(20);
        root.right =new TreeNode(30);

        root.left.left =new TreeNode(40);
        root.left.right =new TreeNode(50);
        root.right.left =new TreeNode(60);
        root.right.right =new TreeNode(70);

        System.out.print("Inorder traversal : ");
        inorder(root);  

        System.out.print("\nPreorder traversal : ");
        preorder(root);

        System.out.print("\nPostorder traversal : ");
        postorder(root);
    }
}
