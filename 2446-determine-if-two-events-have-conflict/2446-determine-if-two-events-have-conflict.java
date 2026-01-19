class Solution {
     public boolean haveConflict(String[] event1, String[] event2) {


        int s1=convert(event1[0]);
        int e1=convert(event1[1]);
        int s2=convert(event2[0]);
        int e2=convert(event2[1]);

        if(s1<=e2&&s2<=e1)
        {
            return true;

        }
        else 
        {
            return false;
        }
     }
   

        int convert(String s)
        {
            int h=Integer.parseInt(s.substring(0,2));
            int m=Integer.parseInt(s.substring(3,5));
            return h*60+m;
        }

    
        
    
}