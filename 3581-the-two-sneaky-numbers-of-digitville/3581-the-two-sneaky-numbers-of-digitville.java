class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i : nums)
        {
            if(!set1.add(i)) 
            {
                set2.add(i);
            }
        }
        int[] arr = new int[set2.size()];
        int k = 0;
        for(int i : set2)
        {
            arr[k++] = i;
        }
        return arr;
    }
}