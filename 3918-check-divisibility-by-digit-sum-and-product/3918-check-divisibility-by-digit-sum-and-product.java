class Solution {
    public boolean checkDivisibility(int n) {
        int temp = n;
        int sum = 0;
        int prod = 1;
        while(temp != 0)
        {
            sum += temp%10;
            prod *= temp%10;
            temp/=10;
        }
        int ans = sum + prod;
        if(n % ans == 0) return true;
        return false;
    }
}