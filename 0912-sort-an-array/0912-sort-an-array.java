class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
        
    }
    void mergeSort(int[]arr,int left,int right)
    {
        if(left>=right)
        return;
        int mid=left+(right-left)/2;
        mergeSort(arr,left,mid);
        mergeSort(arr,mid+1,right);
        merge(arr,left,mid,right);
    }
    private void merge(int[]arr,int left,int mid,int right)
    {
       int[]merged=new int[right-left+1];
       int idx1=left;
       int idx2=mid+1;
       int x=0;
       
       while(idx1<=mid&&idx2<=right)
       {
        if(arr[idx1]<=arr[idx2])
        {
            merged[x++]=arr[idx1++];
        }
        else 
        {
            merged[x++]=arr[idx2++];
        }
       }
         while(idx1<=mid)
         {
            merged[x++]=arr[idx1++];
         }
         while(idx2<=right)
         {
             merged[x++]=arr[idx2++];
         }
        for(int i=0,j=left;i<merged.length;i++, j++)
        {
           arr[j]=merged[i];
        }
       }
    }
