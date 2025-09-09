class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
         if (nums == null || nums.length < 2 || indexDiff <= 0) return false;

        TreeSet<Long> set = new TreeSet<>();

        for (int i = 0; i < nums.length; i++) {
            long num = nums[i];

            Long ceil = set.ceiling(num);
            if (ceil != null && ceil - num <= valueDiff) {
                return true;
            }

            
            Long floor = set.floor(num);
            if (floor != null && num - floor <= valueDiff) {
                return true;
            }

           
            set.add(num);

           
            if (i >= indexDiff) {
                set.remove((long) nums[i - indexDiff]);
            }
        }

        return false;
  
       }
}