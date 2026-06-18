class Solution {
    public boolean isArraySpecial(int[] arr) {
        if(arr.length == 1) return true;
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = i + 1; j <= i + 1; j++){
                if((arr[i] % 2 == 0 && arr[j] % 2 == 0) || (arr[i] % 2 != 0 && arr[j] % 2 != 0)){
                    return false;
                }
            }
        }
        return true;
    }
}

