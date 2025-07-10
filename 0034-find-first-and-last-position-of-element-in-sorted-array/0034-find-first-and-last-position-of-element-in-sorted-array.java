class Solution {
    public int[] searchRange(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums)
        {
            list.add(i);
        }
        int first = list.indexOf(target);
        int last = list.lastIndexOf(target);
        return new int[] {first,last};
    }
}