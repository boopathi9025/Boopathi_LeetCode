class Solution {
    public boolean isFascinating(int n) {
        String str = n+""+(n*2)+(n*3);
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        String st = String.valueOf(ch);
        if(st.equals("123456789")) return true;
        return false;  
    }
}