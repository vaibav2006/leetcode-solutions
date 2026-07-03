class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int c=0;
        if(startTime[0]==endTime[0] && startTime.length==1 && queryTime==startTime[0]) return 1;
        for(int i=0;i<startTime.length;i++){
            for(int j=startTime[i];j<=endTime[i];j++){
                if(j==queryTime){
                    c++;
                }
            }
            
        }
        return c;
    }
}
