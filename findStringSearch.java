class solution{
    public static void main(String[] args) {
        String A = "amazon";
        String B = "amazzz";
        int i = 0, j = 0, count = 0;
        while(i < A.length() && j < B.length()){
            if(A.charAt(i) == B.charAt(j)) {
                i++;
                count++;
            }
            j++;
        }
        System.out.println(A.length() - count); 
    }
}
