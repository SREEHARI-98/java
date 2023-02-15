package Trees;
import java.util.*;
public class IterPostOdr {
    public static void main(String[] args) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode A = new TreeNode(1);
        TreeNode temp = A;
        ArrayList<Integer> ans = new ArrayList<>();
        while(temp != null || !stack.empty()){
            
            if(temp != null){
                ans.add(temp.val);
                stack.push(temp);
                temp = temp.right;
            }else{
                temp = stack.pop();
                temp = temp.left;
            }
            
        }
        Collections.reverse(ans);
        System.out.println(ans);
    }
}
