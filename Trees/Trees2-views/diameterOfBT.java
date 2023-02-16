import Trees.TreeNode;

public class diameterOfBT {
    static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        TreeNode A = new TreeNode(-1);
        height(A);
        System.out.println(max + 2);
    }

    public static int height(TreeNode A) {
        if (A == null)
            return -1;
        int l = height(A.left);
        int r = height(A.right);
        max = Math.max(max, l + r);
        return 1 + Math.max(l, r);
    }
}
