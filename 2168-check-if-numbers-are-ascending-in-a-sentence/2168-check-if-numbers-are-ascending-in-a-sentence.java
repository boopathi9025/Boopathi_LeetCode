class Solution {
    public boolean areNumbersAscending(String s) {
        String[] str = s.split(" ");
        int min = -1;
        for(String st : str)
        {
            if(isNumber(st))
            {
                int num = Integer.parseInt(st);
                if(num <= min) return false;
                min = num;
            }
        }
        return true;
    }

    public boolean isNumber(String s) {
        for(char c : s.toCharArray())
        {
            if(!Character.isDigit(c)) return false;
        }
        return true;
    }
}