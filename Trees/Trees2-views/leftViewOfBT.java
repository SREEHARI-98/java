
/**
 * leftViewOfBT
 */
import Trees.TreeNode;
import java.util.*;

public class leftViewOfBT {

    public static void main(String[] args) {
        TreeNode A = new TreeNode(-1);
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.add(A);
        q.add(null);
        while (q.size() != 1) {
            while (q.peek() != null) {
                TreeNode temp = q.poll();
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
            q.poll();
            if (q.peek() != null)
                ans.add(q.peek().val);
            q.add(null);
        }
        System.out.println(ans);
    }
}