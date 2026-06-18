import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean areNumbersAscending(String s) {
        List<Integer> l = new ArrayList<>();
        String[] n = s.split(" ");
        for (String word : n) {
            int currentNumber = 0;
            boolean hasDigit = false;
            
            for (int j = 0; j < word.length(); j++) {
                if (Character.isDigit(word.charAt(j))) {
                    int d = word.charAt(j) - '0';
                    currentNumber = (currentNumber * 10) + d; 
                    hasDigit = true;
                }
            }
            if (hasDigit) {
                l.add(currentNumber);
            }
        }
        int[] arr = new int[l.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = l.get(i);
        }
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    c++;
                }
            }
        }
        int expectedPairs = (arr.length * (arr.length - 1)) / 2;
        
        if (c == expectedPairs) {
            return true;
        }
        return false;
    }
}

