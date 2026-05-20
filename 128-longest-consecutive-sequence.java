class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> map = new HashMap<>();
        int result= 0;
        for (int i : nums){
            map.put(i, true);
        }
        for(int i : map.keySet()){
            if(!map.containsKey(i-1)){
                int j = i;
                int count = 1;
                while(map.containsKey(j+1)){
                    j++;
                    count++;
                }
                result = Math.max(count,result);
            }
        }

        return result;
    }
}