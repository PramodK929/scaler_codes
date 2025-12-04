package module6;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfAString {
    public static void main(String[] args) {
        String str = "abc";
        List<String> strings = new ArrayList<>();
        backtrack(str, 0, new char[str.length()], new boolean[str.length()], strings );
        for(int i=0; i<strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }

    private static void backtrack(String str, int idx, char[] ans, boolean[] visited, List<String> strings) {
        if(idx == str.length()) {
            for(int i=0; i<ans.length; i++){
                System.out.print(ans[i]);
            }
            System.out.println();
            strings.add(ans.toString());
            return;
        }
        for(int i=0; i<visited.length; i++) {
            if(!visited[i]) {
                visited[i] = true;
                ans[idx] = str.charAt(i);
                backtrack(str, idx+1, ans, visited, (List<String>) new ArrayList<>(strings).clone());
            }
            visited[i] = false;
        }

    }

    
}
