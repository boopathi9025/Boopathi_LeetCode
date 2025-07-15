class Solution {
    public boolean isValid(String word) {
        int vowel = 0;
        int cons = 0;
        if(word.length() < 3) return false;
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(!Character.isLetterOrDigit(ch)) return false;
            if("aeiouAEIOU".contains(String.valueOf(ch))) vowel++;
            else if(Character.isLetter(ch)) cons++;
        }
        return vowel > 0 && cons > 0;
    }
}