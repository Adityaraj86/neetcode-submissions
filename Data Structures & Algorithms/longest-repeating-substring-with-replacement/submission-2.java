class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] fre = new int[26];
        int maxFre = 0;
        int maxLen = 0;
        int i = 0, j= 0;
        while(j<n){
            maxFre = Math.max(maxFre,++fre[s.charAt(j)-'A']);
            while((j-i+1)-maxFre > k){
                fre[s.charAt(i)-'A']--;
                i++;
            }
            maxLen = Math.max(maxLen,j-i+1);
            j++;
        }
        return maxLen;
    }
}
