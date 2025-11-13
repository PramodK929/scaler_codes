class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class BinarySearchTreeInput {

    public static TreeNode buildBST(int[] values) {
        TreeNode root = null;
        for (int value : values) {
            root = insertIntoBST(root, value);
        }
        return root;
    }

    private static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        } else {
            root.right = insertIntoBST(root.right, val);
        }
        return root;
    }
        
}
