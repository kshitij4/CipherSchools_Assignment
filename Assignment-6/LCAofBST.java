
package BST;

import Trees.TreeNode;

public class LCAofBST {
    
    public static TreeNode LCA(TreeNode root, int  data1, int  data2)
    {
        if(root.data > data1 && root.data > data2)
        {
            return LCA(root.left, data1, data2);
        }
        else if(root.data < data1 && root.data < data2)
        {
            return LCA(root.right, data1, data2);
        }
        else
            return root;
    }

    public static void main(String[] args) {
        TreeNode root =new TreeNode(70);

        root.left =new TreeNode(20);
        root.right =new TreeNode(100);

        root.left.left =new TreeNode(10);
        root.left.right =new TreeNode(30);
        root.right.left =new TreeNode(80);
        root.right.right =new TreeNode(110);

        TreeNode res = LCA(root, 30 , 10);
        System.out.println("LCA : " + res.data );
    }
}
