public class Sqrt {

    public static int solve(int A) {
        int s = 0;
        int e = A;
        int mid = 0;
        while(s <= e) {
            mid = ((s-e-1)/2)+e;
            if(mid*mid == A) return mid;
            else if(mid * mid > A) e = mid-1;
            else s = mid+1;
        }
        if(mid * mid > A)
            return mid-1;
        return mid + 1;
    }
    public static void main(String[] args) {
        int A = 2147483647;
        int ans = solve(A);
        System.out.println("Sqrt of "+ A + " is : "+ ans);
    }
}
