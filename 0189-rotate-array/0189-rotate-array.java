class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(i);
        }
        Collections.rotate(list,k);
        for(int i=0;i<n;i++)
        {
            nums[i] = list.get(i);
        }
        System.out.print(Arrays.toString(nums));
    }
}