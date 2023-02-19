package Trees;

import java.util.*;

public class InorderTraversal {
    public static ArrayList<Integer> inorderTraversal(TreeNode temp) {
        // TreeNode temp = new TreeNode(1);
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        while (temp != null || !stack.empty()) {
            if (temp != null) {
                stack.push(temp);
                temp = temp.left;
            } else {
                temp = stack.pop();
                ans.add(temp.val);
                temp = temp.right;
            }
        }
        return ans;
    }
}
