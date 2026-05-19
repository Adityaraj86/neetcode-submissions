class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_set<int> st;
        for(int& it:nums){
            if(st.find(it)!=st.end()) return true;
            st.insert(it);
        }
        return false;
    }
};