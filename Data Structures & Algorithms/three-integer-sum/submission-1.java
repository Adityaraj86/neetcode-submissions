class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1, k = n-1;
            int reqSum = -nums[i];
            while(j<k){
                if(nums[j]+nums[k]>reqSum){
                    k--;
                }
                else if(nums[j]+nums[k]<reqSum){
                    j++;
                }
                else{
                    while(j<k && nums[j]==nums[j+1]){
                        j++;
                    }
                    while(j<k && nums[k]==nums[k-1]){
                        k--;
                    }

                    List<Integer> arr = new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(nums[k]);
                    result.add(arr);
                    j++;
                    k--;
                }
            }
        }
        return result;
    }
}
