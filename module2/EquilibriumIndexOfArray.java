package module2;

public class EquilibriumIndexOfArray {

    public static int solve(int[] A) {
        int totalSum = 0;
        for (int num : A) totalSum += num;
        int leftSum = 0;
        for (int i = 0; i < A.length; i++) {
            totalSum -= A[i];
            if (leftSum == totalSum) return i;
            leftSum += A[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] A = {-7, 1, 5, 2, -4, 3, 0};
        int ans = solve(A);
        System.out.println(ans);
    }
}



// i   Sum of elements at lower indexes    Sum of elements at higher indexes
// 0                   0                                   7
// 1                  -7                                   6
// 2                  -6                                   1
// 3                  -1                                  -1
// 4                   1                                   3
// 5                  -3                                   0
// 6                   0                                   0