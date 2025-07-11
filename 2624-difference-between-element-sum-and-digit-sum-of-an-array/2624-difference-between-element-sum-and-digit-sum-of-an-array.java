class Solution {
    public int differenceOfSum(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
        }
        int sum1 = 0;
        for(int i=0;i<nums.length;i++)
        {
            int temp = nums[i];
            while(temp != 0)
            {
                int dig = temp % 10;
                sum1 += dig;
                temp /= 10;
            }
        }
        return sum - sum1;
    }
}