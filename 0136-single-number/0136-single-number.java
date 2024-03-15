class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length, count=0;
        for(int i=0;i<n;i++){
            count ^= nums[i];// xor operation
        }
        return count;
    }
}