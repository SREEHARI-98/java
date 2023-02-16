
/**
 * rightViewOfBT
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import Trees.TreeNode;
public class rightViewOfBT {

    public static void main(String[] args) {
        TreeNode A = new TreeNode(1);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(A);
        ArrayList<Integer> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            int n = q.size();
            for (int i = 0; i < n; i++) {
                TreeNode temp = q.poll();
                if (i == (n - 1))
                    ans.add(temp.val);
                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }
        }
        // another way without for loop - using nnull to dentify the levels
        // ArrayList<Integer> ans = new ArrayList<>();
        // Queue<TreeNode> q = new LinkedList<>();
        // q.add(A);
        // q.add(null);
        // while(q.size() != 1){
        //     while(q.peek() != null){
        //         TreeNode temp = q.poll();
        //         if(q.peek() == null)ans.add(temp.val);
        //         if(temp.left != null)q.add(temp.left);
        //         if(temp.right != null)q.add(temp.right);
        //     }
        //     q.poll();
        //     q.add(null);
        // }
        System.out.println(ans);
    }
}
