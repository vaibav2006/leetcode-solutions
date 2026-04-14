class Solution {
    public int scoreOfString(String s) {

        int score = 0;

        for(int pos = 0; pos < s.length() - 1; pos++){
            score += Math.abs(s.charAt(pos) - s.charAt(pos + 1));
        }

        return score;
    }
}
