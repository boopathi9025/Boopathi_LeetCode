class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] freq = new boolean[26];
        int count = 0;
        for(char c : allowed.toCharArray())
        {
            freq[c - 97] = true;
        }
        for(String ch : words)
        {
            boolean flag = true;
            for(char c : ch.toCharArray())
            {
                if(!freq[c - 97])
                {
                    flag = false;
                    break;
                }
            }
            if(flag)
            {
                count++;
            }
        }
        return count;
    }
}