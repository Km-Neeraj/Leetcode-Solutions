class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
   
   int max = 0;
        for (int x : nums1) max = Math.max(max, x);
        for (int x : nums2) max = Math.max(max, x);


        int[]freq=new int[max+1];
        for(int i=0;i<nums1.length;i++)
        {
            freq[nums1[i]]=1;
        }
        int[]temp=new int[nums2.length];
        int k=0;
        for(int i=0;i<nums2.length;i++)
        {
            if(freq[nums2[i]]==1)
            {
                temp[k++]=nums2[i];
                freq[nums2[i]]=-1;
            }
        }
        int []res=new int[k];
        for(int i=0;i<k;i++)
        {
           res[i]=temp[i];
        }
        return res;
        
    }
}