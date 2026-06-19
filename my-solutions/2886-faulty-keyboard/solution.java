class Solution {
    public String finalString(String s) {
        String st = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                StringBuilder sb = new StringBuilder(st);
                st = sb.reverse().toString();
            } else {
                st += s.charAt(i); 
            }
        }
        return st;
    }
}

