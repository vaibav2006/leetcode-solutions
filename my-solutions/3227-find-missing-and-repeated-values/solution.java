class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer> hs=new HashSet<>();
        int[] ar=new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(hs.contains(grid[i][j])){
                    ar[0]=grid[i][j];
                }
                hs.add(grid[i][j]);
            }
        }
        for(int i=1;i<=grid.length*grid[0].length;i++){
            if(!hs.contains(i)){
                ar[1]=i;
            }
        }
        
        return ar;
        
    }
}
