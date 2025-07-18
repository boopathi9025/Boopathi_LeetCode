class Solution {
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
        }
        int rem = sum%k;
        if(sum%k == 0) return 0;
        return rem;
    }
}