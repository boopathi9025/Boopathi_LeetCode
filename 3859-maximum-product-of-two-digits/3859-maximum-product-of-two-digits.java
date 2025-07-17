class Solution {
    public int maxProduct(int n) {
        List<Integer> list = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while(n != 0)
        {
            list.add(n % 10);
            n /=10;
        }
        Collections.sort(list);
        if(list.size() >= 2)
        {
             p1 = list.get(list.size()-1);
             p2 = list.get(list.size()-2);
        }
        return p1*p2;
    }
}