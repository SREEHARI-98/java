package stacks;
import java.util.*;
public class maxFreqStack {
    public static void main(String[] args) {
        int[][] A = { {1, 5},{1, 7},{1, 5}
            ,{1, 7},{1, 4},{1, 5},{2, 0},{2, 0},{2, 0},{2, 0}  };
        ArrayList<Integer>  ans = new ArrayList<>();
        HashMap<Integer, Integer> freq = new HashMap<>();
        HashMap<Integer, Stack<Integer>> stackFreq = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int[] x : A) {
            if(x[0] == 1){
                freq.put(x[1], freq.getOrDefault(x[1], 0)+1);
                int f = freq.get(x[1]);
                max = Math.max(max, f);
                if(!stackFreq.containsKey(f)){
                    stackFreq.put(f, new Stack<>());
                }
                stackFreq.get(f).add(x[1]);
                ans.add(-1);
            }else{
                int y = stackFreq.get(max).pop();
                ans.add(y);
                freq.put(y, freq.get(y)-1);
                if(stackFreq.get(max).size() == 0){
                    max--;
                }
            }
        }
        System.out.println(ans);
    }
}
