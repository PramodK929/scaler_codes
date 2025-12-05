import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestSmallerElement {
    public static void main(String[] args) {
        int[] x = new int[]{39,27,11,4,24,32,32,1};
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
