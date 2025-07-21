class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extra) {
        List<Boolean> list = new ArrayList<>();
        int max = 0;
        for(int i : candies)
        {
            if(i > max) max = i;
        }
        for(int i : candies)
        {
            if(i + extra >= max) list.add(true);
            else list.add(false);
        }
        return list;
    }
}