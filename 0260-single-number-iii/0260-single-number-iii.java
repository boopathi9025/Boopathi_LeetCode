class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        } 
        List<Integer> list = new ArrayList<>();
        for(int key : map.keySet()){
            if(map.get(key) == 1){
                list.add(key);
            }
        }  
        int[] arr = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i] = list.get(i);
        }
        return arr;
    }
}