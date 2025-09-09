class Solution {

   private boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public int minCut(String s) {
        int n = s.length();
        int[] dp = new int[n];  
        for (int i = 0; i < n; i++) {
            if (isPalindrome(s, 0, i)) {
            } else {
                dp[i] = i; 
                for (int j = 0; j < i; j++) {
                    if (isPalindrome(s, j + 1, i)) {
                        dp[i] = Math.min(dp[i], dp[j] + 1);
                    }
                }
            }
        }

        return dp[n - 1];
    }
  }

        

        
    