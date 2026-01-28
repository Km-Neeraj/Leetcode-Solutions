class Solution {
    public long[] sumOfThree(long num) {

        if(num%3!=0)
        return new long[0];

        long md=num/3;
        return new long[]{md-1,md,md+1};
        
    }
}