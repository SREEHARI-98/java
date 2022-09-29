import java.util.ArrayList;

public class maxMin {
        public int solve(ArrayList<Integer> A) {
            int mx = Integer.MIN_VALUE;
            int mn = Integer.MAX_VALUE;
            for(int i = 0; i < A.size(); i++){
                if(A.get(i) > mx){
                    mx = A.get(i);
                }
                if(A.get(i) < mn){
                    mn = A.get(i);
                }
            }
            return mx+mn;
        }
    }
