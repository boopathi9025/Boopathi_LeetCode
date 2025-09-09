class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
       
        Set<String> wordSet = new HashSet<>(wordDict);
        Map<String, List<String>> memo = new HashMap<>();
        return backtrack(s, wordSet, memo);
    }

    private List<String> backtrack(String s, Set<String> wordSet, Map<String, List<String>> memo) {
        if (memo.containsKey(s)) return memo.get(s);

        List<String> result = new ArrayList<>();
        if (s.isEmpty()) {
            result.add("");
            return result;
        }

        for (String word : wordSet) {
            if (s.startsWith(word)) {
                String remainder = s.substring(word.length());
                List<String> subSentences = backtrack(remainder, wordSet, memo);
                for (String sub : subSentences) {
                    if (sub.isEmpty()) {
                        result.add(word);
                    } else {
                        result.add(word + " " + sub);
                    }
                }
            }
        }

        memo.put(s, result);
        return result;
    }
    }
