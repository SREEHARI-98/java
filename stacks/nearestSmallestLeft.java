package stacks;

import java.util.Arrays;
import java.util.Stack;

public class nearestSmallestLeft {
    public static void main(String[] args) {
        int[] A = {4, 5, 2, 10, 8, 2};
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            while(!stack.empty() && stack.peek() >= A[i]){
                stack.pop();
            }
            res[i] = stack.empty() ? -1 : stack.peek();
            stack.push(A[i]);
        }
        System.out.println(Arrays.toString(res));
    }
}
