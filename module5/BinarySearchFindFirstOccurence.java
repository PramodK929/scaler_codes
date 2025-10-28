/*
 * Given A[n] sorted array of n elements, possibly with duplicates,
 * the task is to find the index of first occurrence of an element x in the given array
 * using Binary Search with Recursion.
 * 
 * Author: Pramod K
*/
public class BinarySearchFindFirstOccurence { 
    
    public static int findFirstOccurenceWithRecussion(int[] arr, int target) {
        return findFirstOccurenceHelper(arr, target, 0, arr.length - 1, -1);
    }

    private static int findFirstOccurenceHelper(int[] arr, int target, int left, int right, int ans) {
        if (left > right) {
            return ans;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            ans = mid;
            return findFirstOccurenceHelper(arr, target, left, mid - 1, ans);
        } else if (arr[mid] < target) {
            return findFirstOccurenceHelper(arr, target, mid + 1, right, ans);
        } else {
            return findFirstOccurenceHelper(arr, target, left, mid - 1, ans);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int result = findFirstOccurenceWithRecussion(arr, target);
        System.out.println("First occurrence of " + target + " is at index: " + result);
    }
}
