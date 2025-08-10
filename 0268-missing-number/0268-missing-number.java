class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int ans = n*(n+1)/2;
        int sum = 0;
        for(int i : nums)
        {
            sum += i;
        }
        return ans - sum;
    }
}