class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        helper(1,n,k,temp,ans);
        return ans;
    }



    private static void helper( int start,int last,int size,List<Integer> temp,List<List<Integer>> ans ){
        if(temp.size() == size){
            ans.add(new ArrayList(temp));
            return;
        }

        for(int i = start;i <= last;i++){
            temp.add(i);
            helper(i+1,last,size,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}