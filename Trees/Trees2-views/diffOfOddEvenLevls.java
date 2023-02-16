
import java.util.*;
import Trees.TreeNode;

public class diffOfOddEvenLevls {

    public static void main(String[] args) {
        TreeNode A = new TreeNode(-1);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        q.add(null);
        int oddLevel = 0;
        int evenLevel = 0;
        boolean flag = false;
        while (q.size() != 1) {
            int sum = 0;
            while (q.peek() != null) {
                TreeNode temp = q.poll();
                sum += (temp.val);
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
            if (flag) {
                evenLevel += sum;
            } else
                oddLevel += sum;
            flag = !flag;
            q.poll();
            q.add(null);
        }
        System.out.println(oddLevel - evenLevel);
    }
}
