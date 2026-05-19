class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length;
        List<List<Integer>>  results = new ArrayList<>();
        for(int i=0; i<size-2;i++){
            int complement = - nums[i];
            int l = i+1 ;
            int r = size - 1;
    
            //Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while(l<r){
                if (nums[l]+nums[r] == complement){
                    results.add(List.of(nums[i],nums[l],nums[r]));
                    l++;
                    r--;

                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }

                }
                else if (nums[l]+nums[r] < complement){
                    l = l+1;
                }
                else {
                    r = r - 1;
                }

            }
        }

        return results;
    }
}