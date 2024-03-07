class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length, j=0;
        k=k%n;
        int[] ans = new int[n];
        if(n==1 || n==0)
            return;
        for(int i=n-k;i<n;i++){
            ans[j++] = nums[i];
        }
        for(int i=0;i<n-k;i++){
            ans[j++] = nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i] = ans[i];
        }
    }
}