import Trees.TreeNode;

public class balancedBT {
    public static void main(String[] args) {
        /* By creating a new class info we are compating the height and balance for a tree*/
        System.out.println();
    }
    public class info{
        int l;
        boolean ok;
        info(int l, boolean ok){
            this.l = l;
            this.ok = ok;
        }
    }
    
    public int isBalanced(TreeNode A) {
        if(check(A).ok) return 1;
        return 0;
    }
    public info check(TreeNode A){
        if(A == null){
            return new info(-1, true);
        }
        info infoL = check(A.left);
        if(infoL.ok == false){
            return new info(-1, false);
        }
        info infoR = check(A.right);
        if(infoR.ok == false || Math.abs(infoL.l - infoR.l) > 1){
            return new info(-1, false);
        }
        return new info(1 + Math.max(infoL.l, infoR.l), true);
    }
}
