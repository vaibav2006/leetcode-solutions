class Solution {
    public int firstMissingPositive(int[] nums) {
        boolean found = false;
        for (int x : nums) if (x == 1) { found = true; break; }
        
        if (!found) {
            return 1;
        } else {
            Arrays.sort(nums);
            int missing = 1;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= 0) {
                    continue;
                }
                if (nums[i] == missing) {
                    missing++;
                }
                else if (nums[i] > missing) {
                    return missing;
                }
            }
            return missing;
        }
    }
}

