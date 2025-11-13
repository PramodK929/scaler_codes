import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//    TreeNode(int x) {
//        val = x;
//        left=null;
//        right=null;
//    }
//}

public class LevelOrder {
    
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(6);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        //root.right.right = new TreeNode(7);
        int[][] result = levelOrderTraversal(root);
        for(int i=0; i<result.length; i++) {
            for(int j=0; j<result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        
    }

    private static int[][] levelOrderTraversal(TreeNode A) {
        Queue<TreeNode> qParent = new ArrayDeque<>();
        List<List<TreeNode>> list = new ArrayList<>();
        qParent.add(A);
        while(!qParent.isEmpty()) {
            List<TreeNode> temp = new ArrayList<>();
            Queue<TreeNode> qChild = new ArrayDeque<>();
            while(!qParent.isEmpty()) {
                TreeNode node = qParent.peek();
                temp.add(qParent.poll());
                if(node.left != null)
                    qChild.add(node.left);
                if(node.right != null)
                    qChild.add(node.right);
            }
            list.add(temp);
            qParent = qChild;
            qChild = null;
        }
        int[][] result = new int[list.size()][];
        for(int i=0; i<list.size(); i++) {
            int[] row = new int[list.get(i).size()];
            for(int j=0; j<list.get(i).size(); j++) {
                row[j] = list.get(i).get(j).val;
            }
            result[i] = row;
        }
        return result;
    }
    
}
