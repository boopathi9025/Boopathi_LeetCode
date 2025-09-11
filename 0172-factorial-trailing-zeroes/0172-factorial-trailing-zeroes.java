class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
        int count = 0;
        
        int num = n;
        while (num > 0) {
            num = num / 5;
            count += num;
        }
        res = count;
        return res;
    }
}