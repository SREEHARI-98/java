import Trees.TreeNode;

public class searchNodeOfBST {
    public static void main(String[] args) {
        
    }
    public static boolean search(TreeNode A, int B){
        if(A == null) return false;
        if(A.val == B) return true;
        else if(A.val < B){
            return search(A.right, B);
        }else {
           return search(A.left, B);
        }
    }
}
