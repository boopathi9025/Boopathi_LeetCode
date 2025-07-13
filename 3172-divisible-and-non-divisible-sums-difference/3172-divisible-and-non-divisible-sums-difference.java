class Solution {
    public int differenceOfSums(int n, int m) {
        int[] num1 = new int[1001];
        int[] num2 = new int[1001];
        for(int i=1;i<=n;i++)
        {
            if(i%m != 0) num1[i] = i;
            if(i%m == 0) num2[i] = i;
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0;i<num1.length;i++) sum1 += num1[i];
        for(int i=0;i<num2.length;i++) sum2 += num2[i];
        return sum1 - sum2;
    }
}