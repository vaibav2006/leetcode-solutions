class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int total=0;
        total=arrivalTime+delayedTime;
        if(total==24){
            return 0;
        }
        return total%24;
    }
}
