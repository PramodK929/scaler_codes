public class SearchForRange {

    public static int[] solve(int[] A, int B) {
        int lIdx = binarySearchLeft(A, B);
        int rIdx = binarySearchRight(A, B);
        return new int[]{lIdx, rIdx};
        /* int[] result = {-1, -1};
        int left = 0, right = A.length - 1;

        // Find the first occurrence of B
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A[mid] < B) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (left >= A.length || A[left] != B) {
            return result; // B not found
        }
        result[0] = left;

        // Find the last occurrence of B
        right = A.length - 1; // reset right pointer
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (A[mid] <= B) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        result[1] = right;

        return result;
        */
    }

    private static int binarySearchLeft(int[] arr, int k) {
        int lo = 0, hi = arr.length-1, ans = -1;
        while(lo <= hi) {
            int mid = (lo + hi )/2;
            if(arr[mid] == k) {
                ans = mid;
                hi = mid -1;
            } else if(arr[mid] < k) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    private static int binarySearchRight(int[] arr, int k) {
        int lo = 0, hi = arr.length-1, ans = -1;
        while(lo <= hi) {
            int mid = (lo + hi )/2;
            if(arr[mid] == k) {
                ans = mid;
                lo = mid + 1;
            } else if(arr[mid] < k) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 8};
        int target = 8;
        int[] result = solve(arr, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
    
}
