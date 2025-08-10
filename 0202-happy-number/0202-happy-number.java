class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 0 && !set.contains(n))
        {
            set.add(n);
            n = HappyNumber(n);
        }
        return n == 1;
    }
    
    public int HappyNumber(int n){
        int sum = 0;
        while(n != 0)
        {
            int dig = n%10;
            sum += dig*dig;
            n/=10;
        }
        return sum;
    }
}