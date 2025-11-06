public class TreeTraversal {
    
    public static void preOrderTraversal(int[] values) {
        TreeNode root = BinarySearchTreeInput.buildBST(values);
        preOrderHelper(root);
    }

    private static void preOrderHelper(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderHelper(root.left);
        preOrderHelper(root.right);
    }

    public static void inOrderTraversal(int[] values) {
        TreeNode root = BinarySearchTreeInput.buildBST(values);
        inOrderHelper(root);
    }

    private static void inOrderHelper(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderHelper(root.left);
        System.out.print(root.val + " ");
        inOrderHelper(root.right);
    }

    public static void postOrderTraversal(int[] values) {
        TreeNode root = BinarySearchTreeInput.buildBST(values);
        postOrderHelper(root);
    }

    private static void postOrderHelper(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrderHelper(root.left);
        postOrderHelper(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        int[] values = {5, 3, 8, 1, 4, 7, 9};
        
        System.out.println("Pre-order Traversal:");
        preOrderTraversal(values);
        System.out.println();
        
        System.out.println("In-order Traversal:");
        inOrderTraversal(values);
        System.out.println();
        
        System.out.println("Post-order Traversal:");
        postOrderTraversal(values);
        System.out.println();
    }
}
