class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums)
        {
            List<Integer> templist = new ArrayList<>();
            int temp = i;
            while(temp!=0)
            {
                templist.add(temp%10);
                temp /= 10;
            }
            Collections.reverse(templist);
            list.addAll(templist);
        }
        int[] arr = new int[list.size()];
        int k = 0;
        for(int i : list)
        {
            arr[k++] = i;
        }
        return arr;
    }
}