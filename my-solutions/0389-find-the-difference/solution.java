import java.util.ArrayList;
import java.util.List;

class Solution {
    public char findTheDifference(String s, String t) {
        List<Character> l1 = new ArrayList<>();
        
        for (char c : s.toCharArray()) {
            l1.add(c);
        }
        
        for (char c : t.toCharArray()) {
            if (l1.contains(c)) {
                l1.remove((Character) c); 
            } else {
                return c; 
            }
        }
        
        return ' ';
    }
}

