class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int maxsum = 0;
        int winsum = 0;
        for(int i=0;i<k;i++)
        {
            winsum += nums[i];
        }
        maxsum = winsum;
        for(int i=k;i<n;i++)
        {
            winsum += nums[i] - nums[i - k];
            maxsum = Math.max(maxsum, winsum);
        }
        return (double) maxsum/k;
    }
}