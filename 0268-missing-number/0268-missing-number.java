class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> newSet = new HashSet<Integer>();
        for(int num:nums){
            newSet.add(num);
        }
        int count = nums.length + 1;
        for(int i=0;i<count;i++){
            if(!newSet.contains(i)){
                return i;
            }
        }
        return -1;
    }
}