package Trees;


import java.util.LinkedList;
import java.util.List;

public class RootToLeafPath {
    public static List<String> binaryTreePaths(TreeNode root) {

        List<String> paths = new LinkedList<>();

        if (root == null) return paths;

        if (root.left == null && root.right == null) {
            paths.add(root.data + "");
            return paths;
        }

        for (String path : binaryTreePaths(root.left)) {
            paths.add(root.data + "->" + path);
        }

        for (String path : binaryTreePaths(root.right)) {
            paths.add(root.data + "->" + path);
        }
        return paths;
    }

}