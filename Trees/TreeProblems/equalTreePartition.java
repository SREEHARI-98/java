package Trees.TreeProblems;

/**
 * equalTreePartition
 * Given a binary tree A. Check whether it is possible to partition the 
 * tree to two trees which have equal sum of values after removing exactly one edge on the original tree.
 */

import Trees.*;

public class equalTreePartition {

    public static void main(String[] args) {

    }

    class Info {
        long sum;
        boolean ok;

        Info(long sum, boolean ok) {
            this.sum = sum;
            this.ok = ok;
        }
    }

    public int solve(TreeNode A) {
        long sum = totalSum(A);
        if (sum % 2 != 0)
            return 0;
        if (find(A, sum / 2).ok) {
            return 1;
        }
        return 0;
    }

    public long totalSum(TreeNode A) {
        if (A == null)
            return 0;
        return totalSum(A.left) + totalSum(A.right) + A.val;
    }

    public Info find(TreeNode A, long sum) {
        if (A == null)
            return new Info(0l, false);
        Info l = find(A.left, sum);
        Info r = find(A.right, sum);
        long t = l.sum + r.sum + A.val;
        return new Info(t, t == sum || l.ok || r.ok);
    }
}