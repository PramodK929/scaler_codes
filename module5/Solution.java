public class Solution {
    private static boolean isValidNumber(int n) {
        if(n==1 || n==2 || n==3) return true;
        System.out.println("Num= "+ n);
        while(n>0) {
            //int digit = n/10;
            int rem = n % 10;
            n = n/10;
            System.out.println("rem = "+ rem + " n="+n);
            if(rem==1 || rem==2 || rem==3){
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
    public static int[] solve(int A) {
        int[] result = new int[A];
        int k =0;
        for(int i=1; i<=A; i++) {
            if(isValidNumber(i)) {
                result[k++] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int A = 20;
        int[] res = sol.solve(A);
        for(int num: res) {
            System.out.print(num + " ");
        }
    }

}
