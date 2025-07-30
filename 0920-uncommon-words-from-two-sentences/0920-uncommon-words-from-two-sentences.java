class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String str = s1+" "+s2;
        String[] sp = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String i : sp)
        {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        List<String> list = new ArrayList<>();
        for(String i : map.keySet())
        {
            if(map.get(i) == 1) list.add(i);
        }
        String[] arr = new String[list.size()];
        for(int i=0;i<list.size();i++)
        {
            arr[i] = list.get(i);
        }
        return arr;
    }
}