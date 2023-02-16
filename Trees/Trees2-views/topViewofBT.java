import Trees.TreeNode;
import java.util.*;

public class topViewofBT {
    private static class info {
        TreeNode A;
        int l;

        info(TreeNode A, int l) {
            this.A = A;
            this.l = l;
        }
    }

    public static void main(String[] args) {
        TreeNode A = new TreeNode(-1);
        HashMap<Integer, Integer> hm = new HashMap<>();
        Queue<info> q = new LinkedList<>();
        q.add(new info(A, 0));
        int maxL = -1, minL = Integer.MAX_VALUE;
        while (!q.isEmpty()) {
            info temp = q.poll();
            if (!hm.containsKey(temp.l)) {
                hm.put(temp.l, temp.A.val);
            }
            maxL = Math.max(maxL, temp.l);
            minL = Math.min(minL, temp.l);
            if (temp.A.left != null)
                q.add(new info(temp.A.left, temp.l - 1));
            if (temp.A.right != null)
                q.add(new info(temp.A.right, temp.l + 1));

        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = minL; i <= maxL; i++) {
            ans.add(hm.get(i));
        }
        System.out.println(ans);
    }
}
