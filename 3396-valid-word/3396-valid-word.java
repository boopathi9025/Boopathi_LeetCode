class Solution {
    public boolean isValid(String word) {
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int vowel = 0;
        int cons = 0;
        if(word.length() < 3) return false;
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(!Character.isLetterOrDigit(ch)) return false;
            if(Character.isUpperCase(ch)) upper++;
            if(Character.isLowerCase(ch)) lower++;
            if(Character.isDigit(ch)) digit++;
            if("aeiouAEIOU".contains(String.valueOf(ch)))
            {
                vowel++;   
            }
            else if(Character.isLetter(ch))
            {
                cons++;
            }
        }
        return vowel > 0 && cons > 0;
    }
}