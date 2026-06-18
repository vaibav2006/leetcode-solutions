class Solution {
    public int heightChecker(int[] heights) {
        int c=0;
        int[] ar=heights.clone();
        Arrays.sort(heights);
        for(int i=0;i<heights.length;i++){
            if(ar[i]!=heights[i]){
                c++;
            }
        }
        return c;
    }
}
