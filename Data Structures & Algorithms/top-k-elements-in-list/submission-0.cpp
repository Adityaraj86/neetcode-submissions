class Solution {
   public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        int n = nums.size();
        unordered_map<int,int> mpp;
        for(int& it:nums){
            mpp[it]++;
        }
        vector<vector<int>> fre(n+1);
        for(auto& it:mpp){
            fre[it.second].push_back(it.first);
        }
        vector<int> ans;
        for(int i=n;i>=0;i--){
            if(fre[i].size()==0) continue;
            while(fre[i].size()>0 && k>0){
                ans.push_back(fre[i].back());
                fre[i].pop_back();
                k--;
            }
            if(k==0) break;
        }
        return ans;
    }
};
