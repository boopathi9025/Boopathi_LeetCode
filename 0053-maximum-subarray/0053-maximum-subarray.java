class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            int temp = curr + nums[i];
            if(temp < nums[i])
            {
                curr = nums[i];
            }
            else
            {
                curr = temp;
            }
            if(max < curr) max = curr;  
        }
        return max;
    }
}