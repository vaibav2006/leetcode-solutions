class Solution {
    public int numWaterBottles(int n, int e) {
        int s = n; 
        while (n >= e) { 
            int a = n / e;
            int b = n % e;
            s += a;
            n = a + b;
        }
        return s;
    }
}

