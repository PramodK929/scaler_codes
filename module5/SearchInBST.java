public class SearchInBST {

    public int SearchInBST(TreeNode A, int B) {
        if (A == null) {
            return 0;
        }
        if (A.val == B) {
            return 1;
        } else if (B < A.val) {
            return SearchInBST(A.left, B);
        } else {
            return SearchInBST(A.right, B);
        }
    }
    
}
