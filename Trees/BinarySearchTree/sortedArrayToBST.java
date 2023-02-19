
/**
 * sortedArrayToBST
 */
import Trees.TreeNode;
import Trees.InorderTraversal;

public class sortedArrayToBST {
    
    public static void main(String[] args) {
        int[] A = { 1, 2, 3, 4, 5, 6 };
        TreeNode temp = sortToBST(A, 0, A.length - 1);
        System.out.println(InorderTraversal.inorderTraversal(temp));
    }

    public static TreeNode sortToBST(int[] A, int s, int e) {
        if (s > e)
            return null;
        int mid = (s + e) / 2;
        TreeNode root = new TreeNode(A[mid]);
        root.left = sortToBST(A, s, mid - 1);
        root.right = sortToBST(A, mid + 1, e);
        return root;
    }

}