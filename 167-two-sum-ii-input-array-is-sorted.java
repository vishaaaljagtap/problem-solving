class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int size = numbers.length;

        int l = 0;
        int r = size -1;

        while(l<r){
            if(numbers[l]+numbers[r]==target){
                return new int[] {l+1,r+1};
            }
            else if(numbers[l]+numbers[r]<target){
                l++;
            }
            else{
                r--;
            }
        }
        return new int[] {};
    }
}