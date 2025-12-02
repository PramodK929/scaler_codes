package test;

public class IncreaseAndDecrease {
    public static void main(String[] args) {
        int n = 4;
        int m = n;
        boolean isCompleted = false;
        decreaseAndPrint(n, m, isCompleted);
    }

    private static void decreaseAndPrint(int n, int m, boolean isCompleted) {
        if(n==m && isCompleted) {
            return;
        }
        System.err.println(n);
        if(n<=1 || isCompleted) {
            decreaseAndPrint(n+1, m, true);
            if(n==m){
                isCompleted = false;
            }
        }
        decreaseAndPrint(n-1, m, isCompleted);
    }
}
