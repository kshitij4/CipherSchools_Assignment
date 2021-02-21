package Trees;

public class LCAofBinaryTree {

    public static TreeNode LCA(TreeNode root, TreeNode node1, TreeNode node2)
    {
        if(root == null){
            return null;
        }
        if(root == node1 || root == node2){
            return root;
        }

        TreeNode left = LCA(root.left,node1,node2);
        TreeNode right = LCA(root.right,node1,node2);

        if(left != null && right != null){
            return root;
        }
        if(left != null)
            return left;
        else
            return right;
    }

    public static void main(String[] args) {
        TreeNode root =new TreeNode(10);

        root.left =new TreeNode(20);
        root.right =new TreeNode(30);

        root.left.left =new TreeNode(40);
        root.left.right =new TreeNode(50);
        root.right.left =new TreeNode(60);
        root.right.right =new TreeNode(70);

        root.left.right.left =new TreeNode(80);
        root.left.right.right =new TreeNode(90);


        TreeNode resultNode = LCA(root,root.left.left,root.left.right.left);
        System.out.println("LCA : " + resultNode.data);
    }
}
