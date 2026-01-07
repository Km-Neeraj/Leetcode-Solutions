class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[]arr=new int[k];
        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<>();
        for(int x:nums)
        {
          map.put(x,map.getOrDefault(x,0)+1);
        }
        
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->b.getValue()-a.getValue());
        for(int i=0;i<k;i++)
        {
            arr[i]=list.get(i).getKey();
        }
        return arr;
        
    }
}