class Solution {
    public int countWords(String[] words1, String[] words2) {

        LinkedHashMap<String,Integer> m1=new LinkedHashMap<>();
        LinkedHashMap<String,Integer> m2=new LinkedHashMap<>();
        int count=0;
        for(String w:words1)
        {
            m1.put(w, m1.getOrDefault(w,0)+1);
        }
        for(String w:words2)
        {
            m2.put(w,m2.getOrDefault(w,0)+1);
        }
        for(String k:m1.keySet())
        {
            if(m1.get(k)==1&&m2.getOrDefault(k,0)==1)
            count++;
        }
        return count;
        
    }
}