import Trees.TreeNode;
public class largestBSTsubtree {
    class Info{
        long minV;
        long maxV;
        boolean isBST;
        int size;
        Info(long maxV, long minV, boolean isBST, int size){
            this.minV = minV;
            this.maxV = maxV;
            this.isBST = isBST;
            this.size = size;
        }
    }
    int max = -1;
    public static void main(String[] args) {
        
    }
    public Info IsValidInfo(TreeNode A){
        if(A == null){
            return new Info(Long.MIN_VALUE, Long.MAX_VALUE, true, 0);
        }
        Info curLeft = IsValidInfo(A.left);
        Info curRight = IsValidInfo(A.right);
        long curMin = Math.min(A.val, curLeft.minV);
        long curMax = Math.max(A.val, curRight.maxV);
        boolean isValid = ((A.val > curLeft.maxV) && (curRight.minV > A.val) )&& (curLeft.isBST && curRight.isBST);
        int numN = curLeft.size + curRight.size + 1;
        if(isValid){ max = Math.max(max, numN);}
        return new Info(curMax, curMin, isValid, numN);
    }
}
