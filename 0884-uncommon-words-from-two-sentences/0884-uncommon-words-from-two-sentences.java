class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
       ArrayList<String> res=new ArrayList<>();

       LinkedHashMap<String,Integer> m1=new LinkedHashMap<>();
       LinkedHashMap<String,Integer> m2=new LinkedHashMap<>();
       for(String s:s1.split("\\s+"))
       {
        m1.put(s,m1.getOrDefault(s,0)+1);
       }
       for(String s:s2.split("\\s+"))
       {
        m2.put(s,m2.getOrDefault(s,0)+1);
       }
       for(String s:m1.keySet())
       {
          if(m1.get(s)==1 && m2.getOrDefault(s,0)==0)
          {
            res.add(s);
          }
       }
       for(String s:m2.keySet())
       {
           if(m2.get(s)==1 && m1.getOrDefault(s,0)==0)
           {
            res.add(s);
           }
       }
       return res.toArray(new String[0]);
    }
}