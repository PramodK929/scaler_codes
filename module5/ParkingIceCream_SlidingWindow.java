public class ParkingIceCream_SlidingWindow {

    public static int[] slidingMaximum(final int[] A, int B) {
        if (B > A.length) {
            B = A.length;
        }
        int n = A.length;
        int[] result = new int[n - B + 1];
        int maxIndex = -1;
        int currentMax = Integer.MIN_VALUE;

        for (int i = 0; i <= n - B; i++) {
            if (maxIndex < i) {
                currentMax = Integer.MIN_VALUE;
                for (int j = i; j < i + B; j++) {
                    if (A[j] > currentMax) {
                        currentMax = A[j];
                        maxIndex = j;
                    }
                }
            } else {
                if (A[i + B - 1] > currentMax) {
                    currentMax = A[i + B - 1];
                    maxIndex = i + B - 1;
                }
            }
            result[i] = currentMax;
        }
        return result;
    }
    
}
