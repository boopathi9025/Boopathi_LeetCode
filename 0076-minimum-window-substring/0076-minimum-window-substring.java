class Solution {
    public String minWindow(String s, String t) {
         if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        
        Map<Character, Integer> tMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

       
        Map<Character, Integer> window = new HashMap<>();
        int left = 0, right = 0;
        int required = tMap.size();
        int formed = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            window.put(c, window.getOrDefault(c, 0) + 1);

           
            if (tMap.containsKey(c) && window.get(c).intValue() == tMap.get(c).intValue()) {
                formed++;
            }

            
            while (left <= right && formed == required) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                char leftChar = s.charAt(left);
                window.put(leftChar, window.get(leftChar) - 1);

                if (tMap.containsKey(leftChar) && window.get(leftChar).intValue() < tMap.get(leftChar).intValue()) {
                    formed--;
                }
                left++;
            }

            right++;
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }

}