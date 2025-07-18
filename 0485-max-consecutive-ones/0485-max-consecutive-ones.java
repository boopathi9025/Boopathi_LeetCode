class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;
        for(int i : nums)
        {
            if(i == 1) 
            {
                stack.push(i);
                max = Math.max(max,stack.size());
            }
            else
            {
                stack.clear();
            }
        }
        return max;
    }
}