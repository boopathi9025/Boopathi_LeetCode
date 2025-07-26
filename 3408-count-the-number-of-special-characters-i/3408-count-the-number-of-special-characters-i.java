class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> upper = new HashSet<>();
        Set<Character> lower = new HashSet<>();
        for(char c : word.toCharArray())
        {
            if(Character.isUpperCase(c)) upper.add(Character.toLowerCase(c));
        }
        for(char c : word.toCharArray())
        {
            if(Character.isLowerCase(c)) lower.add(c);
        }
        int count = 0;
        for(char ch : lower)
        {
            if(upper.contains(ch)) count++;
        }
        return count;
    }
}