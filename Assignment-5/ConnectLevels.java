package Trees;

public class ConnectLevels {
    public static void connectLevel(TreeNode root) {
        while(root != null) {
            TreeNode dummyTreeNode = new TreeNode(Integer.MIN_VALUE);
            TreeNode childNode = dummyTreeNode;

            while (root != null) {
                if (root.left != null) {
                    childNode.next = root.left;
                    childNode = childNode.next;
                }

                if (root.right != null) {
                    childNode.next = root.right;
                    childNode = childNode.next;
                }
                root = root.next;
            }
            root = dummyTreeNode.next;
        }
    }


    public static void printTree(TreeNode root) {
        if(root == null) {
            return;
        }

        TreeNode temp = root;
        while(temp != null) {
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
        System.out.println();
        if(root.left != null) {
            printTree(root.left);
        } else {
            printTree(root.right);
        }

    }

    public static void main(String[] args) {

        TreeNode root =new TreeNode(10);

        root.left =new TreeNode(20);
        root.right =new TreeNode(30);

        root.left.left =new TreeNode(40);
        root.left.right =new TreeNode(50);

        connectLevel(root);

        printTree(root);

    }
}