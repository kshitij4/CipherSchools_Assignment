package Trees;

public class IsMirrorTree {

    public static boolean isMirror(TreeNode p, TreeNode q) {
        if(p==null && q==null)
            return true;
        if(p==null || q==null)
            return false;
        return (p.data==q.data) && isMirror(p.left,q.right) && isMirror(p.right,q.left);
    }

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(1);
        a.left = new TreeNode(2);
        a.right = new TreeNode(3);
        a.left.left = new TreeNode(4);
        a.left.right = new TreeNode(5);

        b.left = new TreeNode(3);
        b.right = new TreeNode(2);
        b.right.left = new TreeNode(5);
        b.right.right = new TreeNode(4);

        System.out.println(isMirror(a,b));
    }
}