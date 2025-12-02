package module6;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllValidParantheses {
    public static void main(String[] args) {
        int n = 3; // Number of pairs of parentheses
        String[] result = generateParenthesis(n);
        for (String s : result) {
            System.out.println(s);
        }
    }

    private static String[] generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generate(n, n, "", result);
        return result.toArray(new String[0]);
    }
    
    private static void generate(int open, int close, String str, List<String> result) {
       if(open==0 && close==0) {
           result.add(str);
           return;
       }
       if(open > close) return;
       if(open > 0 ) {
           generate(open-1, close, str+"(", result );
       }
       generate(open, close-1, str+")",  result );
    }
}
