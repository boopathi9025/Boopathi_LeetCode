class Solution {
    public String shortestPalindrome(String s) {
         if (s == null || s.length() == 0) return s;

        String rev = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + rev;

       
        int[] lps = new int[combined.length()];
        for (int i = 1; i < combined.length(); i++) {
            int j = lps[i - 1];
            while (j > 0 && combined.charAt(i) != combined.charAt(j)) {
                j = lps[j - 1];
            }
            if (combined.charAt(i) == combined.charAt(j)) {
                j++;
            }
            lps[i] = j;
        }

        
        int prefixLen = lps[combined.length() - 1];

    
        return rev.substring(0, s.length() - prefixLen) + s;


    
    }
}