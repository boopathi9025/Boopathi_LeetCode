class Solution {
    public int distributeCandies(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i : arr) set.add(i);
        return Math.min(set.size(), arr.length/2);
    }
}