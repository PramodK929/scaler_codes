import java.util.ArrayList;
import java.util.List;

public class SubArrayWithGivenSum {

    public static void main(String[] args) {
        int[] arr = {12,1,50,39,32,23,22,44,17,5,9,12,10,50,26,5,23,38,31,5,34,8,21,11,24,44,18,19,6,31,3,47,5,2,33,44,14,9};
        int b = 58;
        int[] result = solve(arr, b);
        
        for(int i=0; i<result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    private static int[] solve(int[] arr, int b) {
        int start = 0, end = 0;
        int i=0, j=1;
        List<Integer> list = new ArrayList<>();
        int prev = arr[i];
        while(j<arr.length) {
            if(arr[i] == b) {
                return new int[]{arr[i]};
            } else if(arr[j] == b) {
                return new int[]{arr[j]};
            }
            int sum = prev + arr[j];
            if(sum == b) {
                start = i;
                end = j;
                break;
            } else if(sum < b) {
                prev += arr[j];
                j++;
            } else {
                prev -= arr[i];
                i++;
            }
        }
        if(start == end) return new int[]{-1};

        int[] result = new int[(j-i)+1];
        int z = 0;
        for(int k=start; k<=end; k++) {
            result[z++] = arr[k];
        }
        return result;
    }
    
}
