class Solution {
    public int longestConsecutive(int[] nums) {

        
         if(nums.length==0)
         return 0;
         int longest=0;
        HashSet<Integer> res=new HashSet<>();
        for(int num:nums)
        {
            res.add(num);
        }

        for(int num:res)
        {
            if(!res.contains(num-1))
            {
                 int curr=num;
                 int  count=1;

                 while(res.contains(curr+1))
                 {
                     curr++;
                     count++;
                 }
                 longest=Math.max(count,longest);
            }
        }
            return longest;
        

        
    }
}