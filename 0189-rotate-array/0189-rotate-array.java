class Solution {
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;
        k=k%n;
        rotate2(nums,0,n-1);
        rotate2(nums,0,k-1);
        rotate2(nums,k,n-1);


        
    }
    void rotate2(int[]arr,int left,int right)
    {
        while(left<right)
        {
           int temp=arr[left];
           arr[left]=arr[right];
           arr[right]=temp;
           left++;
           right--;
        }
    }
}