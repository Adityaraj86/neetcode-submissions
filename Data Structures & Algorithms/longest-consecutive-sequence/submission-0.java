class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for(int num:nums){
            st.add(num);
        }
        int longest = 0;
        for(int it:st){
            if(st.contains(it-1)==true) continue;
            int val = it+1;
            int curr =1;
            while(st.contains(val)){
                curr++;
                val++;
            }
            longest = Math.max(longest,curr);
        }
        return longest;
    }
}
