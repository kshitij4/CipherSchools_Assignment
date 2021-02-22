package BST;

import Trees.TreeNode;

public class BSTKeysInRange {

    public static void getKeys(TreeNode node, int key1, int key2) {
        
        if (node == null) {
            return;
        }

        if (key1 < node.data) {
            getKeys(node.left, key1, key2);
        }

        if (key1 <= node.data && key2 >= node.data) {
            System.out.print(node.data + " ");
        }

        if (key2 > node.data) {
            getKeys(node.right, key1, key2);
        }
    }

    public static void main(String[] args) {
        TreeNode root =new TreeNode(20);

        root.left = new TreeNode(8);
        root.right = new TreeNode(22);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(12);

        int k1 = 1, k2 = 10;

        getKeys(root,k1,k2);
    }
}
