import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestSmallerElement {
    public static void main(String[] args) {
        int[] x = new int[]{39,27,11,4,24,32,32,1};
        //{8,23,22,16,22,7,7,27,35,27,32,20,5,1,35,28,20,6,16,26,48,34}
        // {4, 5, 2, 10, 8};
        //{34,35,27,42,5,28,389,20,28};
        // expected: -1 34 -1 27 -1 5 28 5 20 
        // myoutput: -1 34 -1 27 -1 5 5 5 5 
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<x.length; i++) {
            arr.add(x[i]);
        }
        List<Integer> result = findNearestClosestElement(arr);
        for(int i=0; i<result.size(); i++) {
            System.out.print(result.get(i)+ " ");
        }
        System.out.println();
     }
     //42,5,28,39,20,28
    private static List<Integer> findNearestClosestElement(ArrayList<Integer> arr) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<arr.size(); i++) { 
            int ele = arr.get(i); 
            if(stack.empty()){
                result.add(-1);
            } else if(ele > stack.peek()) {
                result.add(stack.peek());
            } else if(ele <= stack.peek()){
                while(!stack.empty() && stack.peek()>arr.get(i)) {
                    stack.pop();
                }
                if(!stack.empty()) result.add(stack.peek());
                else result.add(-1);
            } else if(!stack.empty()){
                stack.pop();
                result.add(stack.peek());
            }
            stack.push(ele);
        }
        return result;
    }
}
