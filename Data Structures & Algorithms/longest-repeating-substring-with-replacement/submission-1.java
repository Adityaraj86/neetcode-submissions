class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] fre = new int[26];
        int maxFre = 0;
        int maxLen = 0;
        int i = 0, j= 0;
        while(j<n){
            char ch = s.charAt(j);
            fre[ch-'A']++;
            maxFre = Math.max(maxFre,fre[ch-'A']);
            if(j-i+1-maxFre <=k){
                maxLen = Math.max(maxLen,j-i+1);
            }
            else{
                char frontChar = s.charAt(i);
                fre[frontChar-'A']--;
                int newMax = 0;
                for(int l=0;l<26;l++){
                    newMax = Math.max(newMax,fre[l]);
                }
                maxFre = newMax;
                i++;
            }
            j++;
        }
        return maxLen;
    }
}
