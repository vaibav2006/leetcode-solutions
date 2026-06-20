class Solution {
    public int findCenter(int[][] edges) {
        int c = 0;
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[0].length; j++) {
                if (i + 1 < edges.length && (edges[i][j] == edges[i+1][0] || edges[i][j] == edges[i+1][1])) {
                    c = edges[i][j];
                    return c; 
                }
            }
        }
        return c;
    }
}

