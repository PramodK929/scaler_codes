import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//        left = null;
//        right = null;
//    }
//}

public class Test {
    Queue<Integer> queue = new LinkedList<>();
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> result = levelOrderTraversal(A);
        return result;
    }

    private ArrayList<Integer> levelOrderTraversal(TreeNode root) {
        if(root == null) {
            return null;
        }
        if(root.left == null && root.right == null) {
            queue.add(root.val);
        }
        levelOrderTraversal(root.left);
        levelOrderTraversal(root.right);

        ArrayList<Integer> out = new ArrayList<>();
        while(!queue.isEmpty()){
            out.add(queue.poll());
        }
        return out;
    }

    public static void main(String[] args) {
        BinarySearchTreeInput bstInput = new BinarySearchTreeInput();
        int[] values = {4, 2, 6, 1, 3, 5, 7};
        TreeNode root = bstInput.buildBST(values);

//        Test t = new Test();
//        ArrayList<Integer> result = t.solve(root);
//        System.out.println();
//        for(int i=0; i<result.size(); i++) {
//            System.out.print(result.get(i) + " ");
//        }
//        System.out.println();
    }
}
