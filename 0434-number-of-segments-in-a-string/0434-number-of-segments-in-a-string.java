class Solution {
    public int countSegments(String s) {

        s=s.trim();
        if(s.length()==0)
        return 0;
        int count=s.split("\\s+").length;
        return count;
        
    }
}