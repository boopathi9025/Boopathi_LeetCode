class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(String i : sentences)
        {
            String[] str = i.split(" ");
            max = Math.max(max, str.length);
        }
        return max;
    }
}