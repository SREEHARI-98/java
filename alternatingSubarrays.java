import java.util.ArrayList;

/*
You are given an integer array A of length N comprising of 0's & 1's, and an integer B.
You have to tell all the indices of array A that can act as a center of 2 * B + 1 length 0-1 alternating subarray.
A 0-1 alternating array is an array containing only 0's & 1's, and having no adjacent 0's or 1's.
For e.g. arrays [0, 1, 0, 1], [1, 0] and [1] are 0-1 alternating, while [1, 1] and [0, 1, 0, 0, 1] are not.
Example Input
Input 1:

 A = [1, 0, 1, 0, 1]
 B = 1
Input 2:

 A = [0, 0, 0, 1, 1, 0, 1]
 B = 0


Example Output
Output 1:

 [1, 2, 3]
Output 2:

 [0, 1, 2, 3, 4, 5, 6]
**/
public class alternatingSubarrays {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int len = 2*B+1;
        for(int i = 0; i < A.size() - len + 1; i++){
            int curr = -1; // initializing the starting element.
            int flag = 1;  // initializing a flag
            for(int j = i; j < i + len; j++){ // as we need sub-arrays of length B we are calculating the i up-to B.
                if(A.get(j) == curr){
                    flag = 0; // if we found the alternate elements are same update the flag.
                    break; // and break
                }
                curr = A.get(j); // else update the current element.
            }
            if(flag == 1){   // if we found there are no alternating elements update to the arr list.
                arr.add(i+B);
            }
        }
        return arr;
    }

    public  void main(String[] args) {
        ArrayList<Integer> Arr = new ArrayList<Integer>();
        Arr.add(1);
        Arr.add(0);
        Arr.add(1);
        Arr.add(0);
        Arr.add(1);
        System.out.println(solve(Arr  ,  1));
    }
}
