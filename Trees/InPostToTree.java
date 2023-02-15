package Trees;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;
public class InPostToTree {
    static HashMap<Integer, Integer> hm = new HashMap<>();
    public static void main(String[] args) {
        int[] A = {6, 1, 3, 2};
        int[] B = {6, 3, 2, 1};
        
        //Inoreder Tranversal of A Tree
        TreeNode temp = buildTree(A, B);
        System.out.println(temp);
        Stack<TreeNode> stack  = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>();
        while(temp != null || !stack.empty()){
            if(temp != null){
                stack.push(temp);
                temp = temp.left;
            }else{
                temp = stack.pop();
                ans.add(temp.val);
                temp = temp.right;
            }
        }
        System.out.println(ans);
    }
    public static TreeNode buildTree(int[] A, int[] B) {
        for(int i = 0; i < A.length; i++){
            hm.put(A[i], i);
        }
        return construct(A, B, 0, A.length-1, 0, B.length-1);
    }
    public static TreeNode construct(int[] A, int[] B, int Is, int Ie, int Ps, int Pe){
        if(Is > Ie) return null;
        int idx = hm.get(B[Pe]);
        int len = idx - Is;
        TreeNode root = new TreeNode(B[Pe]);
        root.left = construct(A, B,Is,  idx - 1, Ps, Ps+len-1);
        root.right = construct(A, B, idx+1, Ie, Ps+len, Pe-1);
        return root;
    }
    
}