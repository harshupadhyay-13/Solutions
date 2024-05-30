class Solution {
    public int countTriplets(int[] arr) {
        // count=0 for the track of number of triplets, whenever the X==Y condition is met increment
        // first loop starts from 0 to n-1, i
        // second loop starts from each possible middle index j from i+1 to n-1
        // find x as xor values for i to j-1 array values
        // third loop k j to n-1
        // for each iteration from k loop XOR value y in range of j to k, x==y increment count.
        int count=0;
        int n= arr.length;
        for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            int x = 0;
            for(int k =i;k<j;k++)
                x ^= arr[k];
            int y = 0;
            for(int k =j;k<n;k++){
                y ^= arr[k];
                if(x==y)
                    count++;
            }
        }
        }
        return count;
    }
}