class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int n = words.length;
        int index = 0;

        while (index < n) {
            int totalChars = words[index].length();
            int last = index + 1;

            
            while (last < n) {
                if (totalChars + 1 + words[last].length() > maxWidth) break;
                totalChars += 1 + words[last].length(); // 1 for space
                last++;
            }

            StringBuilder sb = new StringBuilder();
            int wordsInLine = last - index;
            
            
            if (last == n || wordsInLine == 1) {
                for (int i = index; i < last; i++) {
                    sb.append(words[i]);
                    if (i != last - 1) sb.append(" ");
                }
                
                int remaining = maxWidth - sb.length();
                while (remaining > 0) {
                    sb.append(" ");
                    remaining--;
                }
            } else { 
                int totalSpaces = maxWidth - (totalChars - (wordsInLine - 1)); 
                int spaceBetweenWords = totalSpaces / (wordsInLine - 1);
                int extraSpaces = totalSpaces % (wordsInLine - 1);

                for (int i = index; i < last; i++) {
                    sb.append(words[i]);
                    if (i != last - 1) {
                        for (int s = 0; s < spaceBetweenWords; s++) sb.append(" ");
                        if (extraSpaces > 0) {
                            sb.append(" ");
                            extraSpaces--;
                        }
                    }
                }
            }

            result.add(sb.toString());
            index = last;
        }

        return result;
    }
}
