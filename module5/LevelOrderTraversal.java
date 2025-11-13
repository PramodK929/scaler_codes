import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

class levelOrderTraversal {

    public int[][] levelOrderTraverse(TreeNode A) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        if (A == null) {
            return new int[0][0];
        }

        queue.add(A);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.poll();
                currentLevel.add(currentNode.val);

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            result.add(currentLevel);
        }
        int[][] answer = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            List<Integer> level = result.get(i);
            answer[i] = new int[level.size()];
            for (int j = 0; j < level.size(); j++) {
                answer[i][j] = level.get(j);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        BinarySearchTreeInput bstInput = new BinarySearchTreeInput();
        int[] values = {4, 2, 6, 1, 3, 5, 7};
        TreeNode root = bstInput.buildBST(values);

        levelOrderTraversal lot = new levelOrderTraversal();
        int[][] result = lot.levelOrderTraverse(root);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}