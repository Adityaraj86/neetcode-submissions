class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i=0,j=n-1;
        while(i<j){
            char ch1 = Character.toLowerCase(s.charAt(i));
            char ch2 = Character.toLowerCase(s.charAt(j));
            if(Character.isLetterOrDigit(ch1)==false){
                i++;
                continue;
            }
            if(Character.isLetterOrDigit(ch2)==false){
                j--;
                continue;
            }
            if(ch1!=ch2) return false;
            i++;
            j--;
        }
        return true;
    }
}
