class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int a =nums[nums.length-1];
        int b =nums[nums.length-2];
        int c = a-1;
        int d = b-1;
        return c*d;
    }
}