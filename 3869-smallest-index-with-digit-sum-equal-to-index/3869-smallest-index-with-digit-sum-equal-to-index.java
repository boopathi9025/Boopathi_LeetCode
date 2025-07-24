class Solution {
    public int smallestIndex(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int sum = 0;
            int temp = nums[i];
            while(temp != 0)
            {
                sum += temp % 10;
                arr[i] = sum;
                temp/=10;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == i) return arr[i];
        }
        return -1;
    }
}