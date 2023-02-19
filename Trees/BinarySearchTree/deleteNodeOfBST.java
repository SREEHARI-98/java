
import Trees.TreeNode;

public class deleteNodeOfBST {
    public static void main(String[] args) {

    }

    public static TreeNode del(TreeNode A, int B) {
        if (A == null)
            return null;
        if (A.val < B) {
            A.right = del(A.right, B);
        } else if (A.val > B) {
            A.left = del(A.left, B);
        } else {
            if (A.left == null && A.right == null)
                return null;
            else if (A.left == null)
                return A.right;
            else if (A.right == null)
                return A.left;
            else {
                int G = findMax(A.left);
                A.val = G;
                A.left = del(A.left, G);
            }
        }
        return A;
    }

    public static int findMax(TreeNode A) {
        while (A.right != null) {
            A = A.right;
        }
        return A.val;
    }
}
