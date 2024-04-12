class Solution {
    public int trap(int[] height) {
        //length of the variable height
        int n=height.length;
        //left is the auxullary array given as the maximum of adjacent elements, from left to right
        int left[] = new int[n];
        //right is the auxullary array given as the maximum of adjacent elements, from  right to left
        int right[] = new int[n];
        left[0]=height[0];
        
        for(int i=1;i<n;i++)
            left[i]=Math.max(left[i-1],height[i]);
        right[n-1]=height[n-1];
        
        for(int i=n-2;i>=0;i--)
            right[i]=Math.max(right[i+1],height[i]);
        
        int ans=0;
        for(int i=0;i<n;i++)
            ans+=(Math.min(left[i],right[i])-height[i]);
        return ans;
    }
}