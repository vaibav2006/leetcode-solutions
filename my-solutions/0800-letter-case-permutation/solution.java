public class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        result.add(""); 

        for (char c : s.toCharArray()) {
            int size = result.size();
            
            if (Character.isDigit(c)) {
                for (int i = 0; i < size; i++) {
                    result.set(i, result.get(i) + c);
                }
            } else {
                for (int i = 0; i < size; i++) {
                    String old = result.get(i);
                    result.set(i, old + Character.toLowerCase(c));
                    result.add(old + Character.toUpperCase(c));
                }
            }
        }
        return result;
    }
}

