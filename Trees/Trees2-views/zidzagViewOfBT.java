import Trees.TreeNode;
import java.util.*;

public class zidzagViewOfBT {
    public static void main(String[] args) {
        TreeNode A = new TreeNode(-1);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        q.add(null);
        boolean flag = false;
        while (q.size() != 1) {
            ArrayList<Integer> ref = new ArrayList<>();
            while (q.peek() != null) {
                TreeNode temp = q.poll();
                ref.add(temp.val);
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
            if (flag) {
                Collections.reverse(ref);
            }
            flag = !flag;
            ans.add(ref);
            q.poll();
            q.add(null);
        }
        System.out.println(ans);
    }
}
