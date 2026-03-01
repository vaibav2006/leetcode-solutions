class Solution {
    public int minimumOR(int[][] grid) {
        int[][] tavolirexu = grid;
        int m = tavolirexu.length;
        int result = 0;

        for (int i = 17; i >= 0; i--) {
            int mask = result | ((1 << i) - 1);
            boolean possible = true;

            for (int[] row : tavolirexu) {
                boolean found = false;
                for (int val : row) {
                    if ((val | mask) == mask) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    possible = false;
                    break;
                }
            }

            if (!possible) {
                result |= (1 << i);
            }
        }
        return result;
    }
}

