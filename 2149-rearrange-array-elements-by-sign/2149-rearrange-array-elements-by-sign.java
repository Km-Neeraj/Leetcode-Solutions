class Solution {
    public int[] rearrangeArray(int[] nums) {

        int pos=0,neg=1;
        int[]temp=new int[nums.length];
        for(int num:nums)
        {
            if(num>=0)
            {
                temp[pos]=num;
                pos=pos+2;
            }
            else 
            {
                temp[neg]=num;
                neg=neg+2;
            }
            
        }
        return temp;
        
    }
}