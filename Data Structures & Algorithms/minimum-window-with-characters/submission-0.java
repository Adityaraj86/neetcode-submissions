class Solution {
    public boolean check(int[] fre1,int[] fre2){
        for(int i=0;i<256;i++){
            if(fre2[i]>0 && fre1[i]<fre2[i]) return false;
        }
        return true;
    }
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();

        int[] fre1 = new int[256];
        for(int i=0;i<m;i++){
            fre1[t.charAt(i)]++;
        }
        String ans = "";
        int minLen = 1001;
        int[] fre2 = new int[256];
        int i=0;
        for(int j=0;j<n;j++){
            fre2[s.charAt(j)]++;
            while(check(fre2,fre1)){
                if(j-i+1<minLen){
                    minLen = j-i+1;
                    ans = s.substring(i,j+1);
                }
                fre2[s.charAt(i)]--;
                i++;
            }
            
        }
        return ans;
    }
}
