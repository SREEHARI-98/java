import java.util.ArrayList;

public class secondLargeNumber {
    public class Solution {
        public int solve(ArrayList<Integer> A) {
            int mx = Integer.MIN_VALUE;
            for(int i = 0; i < A.size(); i++){
                if(A.get(i) > mx){
                    mx = A.get(i);
                }
            }


            int mx2 = Integer.MIN_VALUE;
            for(int i = 0; i < A.size(); i++){
                if(A.get(i) > mx2 && A.get(i) != mx){
                    mx2 = A.get(i);
                }
            }

            if(mx2 == Integer.MIN_VALUE){
                return -1;
            }else{
                return mx2;
            }
        }
    }

}
