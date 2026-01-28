class Solution {
    public String reverseStr(String s, int k) {

        char[]ch=s.toCharArray();
        for(int i=0;i<ch.length;i=i+2*k)
        {
           int low=i;
           int hi=Math.min(i+k-1,ch.length-1);
           while(low<hi)
           {
             char temp=ch[low];
             ch[low]=ch[hi];
             ch[hi]=temp;
             low++;
             hi--;
           }
        }
        return new String(ch);
        
    }
}