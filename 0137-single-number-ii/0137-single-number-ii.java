class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length == 0) return -1;
        for(int i=0;i<nums.length;i++)
        {
            boolean flag = true;
            for(int j=0;j<nums.length;j++)
            {
                if(i != j && nums[i] == nums[j])
                {
                    flag = false;
                    break;
                }
            }
            if(flag) return nums[i];
        }
        return -1;
    }
}