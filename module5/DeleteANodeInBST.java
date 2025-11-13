public class DeleteANodeInBST {

    public TreeNode solve(TreeNode A, int B) {
        if (A == null) {
            return null;
        }
        if (B < A.val) {
            A.left = solve(A.left, B);
        } else if (B > A.val) {
            A.right = solve(A.right, B);
        } else {
            if (A.left == null) {
                return A.right;
            } else if (A.right == null) {
                return A.left;
            }
            TreeNode temp = findMin(A.right);
            A.val = temp.val;
            A.right = solve(A.right, temp.val);
        }
        return A;
        
    }

    private TreeNode findMin(TreeNode right) {
        while (right.left != null) {
            right = right.left;
        }
        return right;
    }
    
}
