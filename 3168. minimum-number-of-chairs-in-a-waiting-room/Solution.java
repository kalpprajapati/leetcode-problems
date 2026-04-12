class Solution {
    public int minimumChairs(String s) {
        int cnt=0;
        int avail=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='E'){
                cnt++;
                avail=Math.max(avail,cnt);
            }else{
                cnt--;
            }
        }
        return avail;
        
    }
}