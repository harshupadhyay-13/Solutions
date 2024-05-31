class Solution {
    public int[] singleNumber(int[] nums) {
        if (nums == null || nums.length < 2 || nums.length % 2 != 0) {
            throw new IllegalArgumentException("Invalid Input, better luck next time");
        }

        int xXORy = 0;
        for (int n : nums) {
            xXORy ^= n;
        }

        int rightSetBit = xXORy & -xXORy;
        int x = 0;
        for (int n : nums) {
            if ((n & rightSetBit) != 0) {
                x ^= n;
            }
        }

        return new int[] {x, xXORy ^ x};
    }
}